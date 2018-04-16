package com.lftechnology.msb.moneytun.serializer;


import com.google.gson.JsonElement;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;

import java.lang.reflect.Type;
import java.time.LocalDate;

public class DateSerializer implements JsonSerializer<LocalDate> {

    @Override
    public JsonElement serialize(LocalDate localDate, Type type, JsonSerializationContext jsonSerializationContext) {
        return null;
    }
}
