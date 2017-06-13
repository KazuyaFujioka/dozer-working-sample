package com.example.infrastructure.datasource.leisure.genre;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.Serializable;
import java.util.Map;

public class JsonOfGenre implements Serializable {

    @JsonProperty("name")
    JsonOfGenreName name;

    @JsonProperty("main")
    boolean main;

    public JsonOfGenre(JsonOfGenreName name, boolean main)
    {
        this.name = name;
        this.main = main;
    }

    public JsonOfGenre(JsonOfGenreName name)
    {
        this.name = name;
    }

    Map<String,Object> mapOfGenre() {
        try {
            ObjectMapper objectMapper = new ObjectMapper();
            String json = objectMapper.writeValueAsString(name);
            return objectMapper.readValue(json, Map.class);
        }
        catch (Exception e)
        {
            throw new RuntimeException(e);
        }
    }

    JsonOfGenre()
    {
    }
}