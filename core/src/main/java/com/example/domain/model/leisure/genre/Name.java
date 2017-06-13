package com.example.domain.model.leisure.genre;

public class Name {

    String text;

    public Name(String text)
    {
        this.text = text;
    }

    Name()
    {
    }

    @Override
    public String toString() {
        return "Name{" +
                "text='" + text + '\'' +
                '}';
    }
}