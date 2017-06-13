package com.example.domain.model.item.plan.activity;

import java.util.List;

/**
 * Created by fujioka on 2017/06/13.
 */
public class Activities {

    List<Activity> list;

    Activities(List<Activity> list)
    {
        this.list = list;
    }

    Activities()
    {
    }

    @Override
    public String toString() {
        return "Activities{" +
                "list=" + list +
                '}';
    }
}