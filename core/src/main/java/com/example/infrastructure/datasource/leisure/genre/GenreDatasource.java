package com.example.infrastructure.datasource.leisure.genre;

import com.example.domain.model.leisure.genre.Genre;
import com.example.domain.model.leisure.genre.Genres;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import org.dozer.Mapper;

import java.util.ArrayList;
import java.util.List;

@Repository
public class GenreDatasource {

    public static JsonOfGenreName vr = new JsonOfGenreName("VR体験");
    public static JsonOfGenreName pottery = new JsonOfGenreName("陶芸体験・陶芸教室");
    public static JsonOfGenreName silver = new JsonOfGenreName("シルバーアクセサリー 手作り体験");
    public static JsonOfGenreName theatre = new JsonOfGenreName("劇場・ショーレストラン");
    public static JsonOfGenreName bouldering = new JsonOfGenreName("ボルダリング");

    private static List<JsonOfGenreName> genreNames = new ArrayList<>();
    {
        genreNames.add(vr);
        genreNames.add(pottery);
        genreNames.add(silver);
        genreNames.add(theatre);
        genreNames.add(bouldering);
    }

    Mapper dozerMapper;

    @Autowired
    GenreDatasource(Mapper dozerMapper)
    {
        this.dozerMapper = dozerMapper;
    }

    public Genre primitiveToModel()
    {
        JsonOfGenreName json = vr;
        Genre genre = dozerMapper.map(json.text, Genre.class, "primitiveToModel");
        return genre;
    }

    public Genre modelToModel()
    {
        JsonOfGenreName json = pottery;
        Genre genre = dozerMapper.map(json, Genre.class, "modelToModel");
        return genre;
    }

    public Genres listToModel()
    {
        Genres genres = dozerMapper.map(genreNames, Genres.class, "listToModel");
        return genres;
    }

    public Genre mapToModel()
    {
        JsonOfGenre jsonOfGenre = new JsonOfGenre(theatre);
        Genre genre = dozerMapper.map(jsonOfGenre.mapOfGenre(), Genre.class, "mapToModel");
        return genre;
    }
}