package com.example.domain.model.leisure.genre;

public class Genre {

    Name name;

    public Genre(Name name)
    {
        this.name = name;
    }

    public Genre()
    {
        this.name = new Name("");
    }

    @Override
    public String toString() {
        return "Genre{" +
                "name=" + name +
                '}';
    }
}