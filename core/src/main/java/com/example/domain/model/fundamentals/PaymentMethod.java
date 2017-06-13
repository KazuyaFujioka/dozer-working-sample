package com.example.domain.model.fundamentals;

public enum PaymentMethod {
    onsite, credit;

    public static PaymentMethod create(String value)
    {
        System.out.print("call!!!");
        return PaymentMethod.valueOf(value);
    }
}