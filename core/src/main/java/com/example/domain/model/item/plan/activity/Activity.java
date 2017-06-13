package com.example.domain.model.item.plan.activity;

import com.example.domain.model.leisure.genre.Genre;
import com.example.domain.model.leisure.genre.Genres;
import com.example.domain.model.fundamentals.PaymentMethod;

public class Activity {

    Title title;

    Genre main;
    Genres substitute;

    PaymentMethod payment;

    Activity()
    {
    }

    @Override
    public String toString() {
        return "Activity{" +
                "title=" + title +
                ", main=" + main +
                ", substitute=" + substitute +
                ", payment=" + payment +
                '}';
    }
}