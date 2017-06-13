package com.example.infrastructure.datasource.leisure.genre;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

class JsonOfGenreName implements Serializable {

    @JsonProperty("text")
    String text;

    JsonOfGenreName(String text)
    {
        this.text = text;
    }

    JsonOfGenreName()
    {
    }
}