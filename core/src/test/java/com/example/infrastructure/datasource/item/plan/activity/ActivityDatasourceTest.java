package com.example.infrastructure.datasource.item.plan.activity;

import com.example.Application;
import com.example.domain.model.item.plan.activity.Activities;
import com.example.domain.model.item.plan.activity.Activity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * Created by fujioka on 2017/06/13.
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
public class ActivityDatasourceTest {

    Log LOG = LogFactory.getLog(ActivityDatasourceTest.class);

    @Autowired
    ActivityDatasource activityDatasource;

    @Test
    public void testFind()
    {
        Activity activity = activityDatasource.find();
        LOG.info(activity);
    }

    @Test
    public void testListAll()
    {
        Activities activities = activityDatasource.listAll();
        LOG.info(activities);
    }
}