package com.example.infrastructure.datasource.item.plan.activity;

import com.example.domain.model.leisure.genre.Genre;
import com.example.domain.model.leisure.genre.Genres;
import org.dozer.BeanFactory;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class GenreSubstituteFactory implements BeanFactory {


    @Override
    public Object createBean(Object source,
                             Class<?> sourceClass,
                             String targetBeanId) {

        List<Map<String, Object>> list = (List<Map<String, Object>>) source;

        List<Genre> genres = new ArrayList<>();
        for(Map map : list)
        {
            boolean main = (boolean) map.get("main");
            if(main) continue;

            Genre genre = GenreFactory.create(map);
            genres.add(genre);
        }
        return new Genres(genres);
    }
}