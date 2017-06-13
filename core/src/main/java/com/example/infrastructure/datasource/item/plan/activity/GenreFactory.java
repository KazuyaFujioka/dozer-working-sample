package com.example.infrastructure.datasource.item.plan.activity;

import com.example.domain.model.leisure.genre.Genre;
import com.example.domain.model.leisure.genre.Name;

import java.util.Map;

/**
 * Created by fujioka on 2017/06/13.
 */
class GenreFactory {

    static Genre create(Map<String, Object> map)
    {
        Map genreName = (Map) map.get("name");
        String text = (String) genreName.get("text");
        return new Genre(new Name(text));
    }
}