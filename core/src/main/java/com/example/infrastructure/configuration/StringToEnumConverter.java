package com.example.infrastructure.configuration;

import org.dozer.CustomConverter;

public class StringToEnumConverter implements CustomConverter {

    @Override
    public Object convert(Object existingDestinationFieldValue,
                          Object sourceFieldValue,
                          Class<?> destinationClass,
                          Class<?> sourceClass) {

        Enum[] enums = (Enum[]) destinationClass.getEnumConstants();
        Enum value = Enum.valueOf(enums[0].getDeclaringClass(), sourceFieldValue.toString());
        return value;
    }
}