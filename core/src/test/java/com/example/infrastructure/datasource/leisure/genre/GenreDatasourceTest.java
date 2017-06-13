package com.example.infrastructure.datasource.leisure.genre;

import com.example.Application;
import com.example.domain.model.leisure.genre.Genre;
import com.example.domain.model.leisure.genre.Genres;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * Created by fujioka on 2017/06/12.
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
public class GenreDatasourceTest {

    Log LOG = LogFactory.getLog(GenreDatasourceTest.class);

    @Autowired
    GenreDatasource genreDatasource;

    @Test
    public void testPrimitiveToModel()
    {
        Genre genre = genreDatasource.primitiveToModel();
        LOG.info(genre);
    }

    @Test
    public void testModelToModel()
    {
        Genre genre = genreDatasource.modelToModel();
        LOG.info(genre);
    }

    @Test
    public void testListToModel()
    {
        Genres genres = genreDatasource.listToModel();
        LOG.info(genres);
    }

    @Test
    public void mapToModel()
    {
        Genre genre = genreDatasource.mapToModel();
        LOG.info(genre);
    }
}