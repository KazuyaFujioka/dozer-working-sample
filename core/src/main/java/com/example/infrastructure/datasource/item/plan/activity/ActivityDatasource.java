package com.example.infrastructure.datasource.item.plan.activity;

import com.example.domain.model.item.plan.activity.Activities;
import com.example.domain.model.item.plan.activity.Activity;
import com.example.infrastructure.datasource.leisure.genre.GenreDatasource;
import com.example.infrastructure.datasource.leisure.genre.JsonOfGenre;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import org.dozer.Mapper;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

@Repository
public class ActivityDatasource {

    JsonOfActivity activity1 = new JsonOfActivity(
            "近未来のゲームセンターで遊ぼう！VR体験",
            Arrays.asList(new JsonOfGenre(GenreDatasource.vr, true)),
            "onsite"
    );

    JsonOfActivity activity2 = new JsonOfActivity(
            "大阪・天王寺・陶芸・電動ろくろコース",
            Arrays.asList(
                    new JsonOfGenre(GenreDatasource.silver, false),
                    new JsonOfGenre(GenreDatasource.pottery, true)
            ),
            "onsite"
    );

    JsonOfActivity activity3 = new JsonOfActivity(
            "ロボットレストラン ★1ドリンクサービス付！",
            Arrays.asList(
                    new JsonOfGenre(GenreDatasource.theatre, true)
            ),
            "credit"
    );

    private static List<JsonOfActivity> activityList = new ArrayList<>();
    {
        activityList.add(activity1);
        activityList.add(activity2);
        activityList.add(activity3);
    }

    Mapper dozerMapper;

    @Autowired
    ActivityDatasource(Mapper dozerMapper)
    {
        this.dozerMapper = dozerMapper;
    }


    public Activity find()
    {
        Map<String,Object>  mapOfActivity = activity1.mapOfActivity();
        Activity activity = dozerMapper.map(mapOfActivity, Activity.class, "activity");
        return activity;
    }

    public Activities listAll()
    {
        JsonOfActivities jsonOfActivities = new JsonOfActivities(activityList);
        List<Map<String,Object>> mapOfActivities = jsonOfActivities.mapOfActivities();

        Activities activities = dozerMapper.map(mapOfActivities, Activities.class, "activities");
        return activities;
    }
}