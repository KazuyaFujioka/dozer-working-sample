package com.example.infrastructure.datasource.item.plan.activity;

import com.example.domain.model.leisure.genre.Genre;
import org.dozer.BeanFactory;

import java.util.List;
import java.util.Map;

public class GenreMainFactory implements BeanFactory {

    @Override
    public Object createBean(Object source,
                             Class<?> sourceClass,
                             String targetBeanId) {
        List<Map<String, Object>> list = (List<Map<String, Object>>) source;

        for(Map map : list)
        {
            boolean main = (boolean) map.get("main");
            if(main)
                return GenreFactory.create(map);
        }
        return new Genre();
    }
}