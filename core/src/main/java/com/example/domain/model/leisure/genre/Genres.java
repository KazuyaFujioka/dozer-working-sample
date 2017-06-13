package com.example.domain.model.leisure.genre;

import java.util.List;

public class Genres {

    List<Genre> list;

    public Genres(List<Genre> list)
    {
        this.list = list;
    }

    Genres()
    {
    }

    @Override
    public String toString() {
        return "Genres{" +
                "list=" + list +
                '}';
    }
}