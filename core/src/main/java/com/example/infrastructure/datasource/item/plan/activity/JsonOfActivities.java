package com.example.infrastructure.datasource.item.plan.activity;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

/**
 * Created by fujioka on 2017/06/13.
 */
class JsonOfActivities implements Serializable {

    @JsonProperty("activities")
    List<JsonOfActivity> list;

    JsonOfActivities(List<JsonOfActivity> list)
    {
        this.list = list;
    }

    List<Map<String,Object>> mapOfActivities() {
        try {
            ObjectMapper objectMapper = new ObjectMapper();
            String json = objectMapper.writeValueAsString(list);
            return objectMapper.readValue(json, List.class);
        }
        catch (Exception e)
        {
            throw new RuntimeException(e);
        }
    }

    JsonOfActivities()
    {
    }
}