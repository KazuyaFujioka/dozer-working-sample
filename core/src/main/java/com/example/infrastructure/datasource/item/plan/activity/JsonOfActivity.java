package com.example.infrastructure.datasource.item.plan.activity;

import com.example.infrastructure.datasource.leisure.genre.JsonOfGenre;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

class JsonOfActivity implements Serializable {

    @JsonProperty("title")
    String title;

    @JsonProperty("genres")
    List<JsonOfGenre> genres = new ArrayList<>();

    @JsonProperty("paymentMethod")
    String payment;

    JsonOfActivity(String title,
                   List<JsonOfGenre> genres,
                   String payment)
    {
        this.title = title;
        this.genres = genres;
        this.payment = payment;
    }

    Map<String,Object> mapOfActivity() {
        try {
            ObjectMapper objectMapper = new ObjectMapper();
            String json = objectMapper.writeValueAsString(this);
            return objectMapper.readValue(json, Map.class);
        }
        catch (Exception e)
        {
            throw new RuntimeException(e);
        }
    }

    JsonOfActivity()
    {
    }
}