package com.lftechnology.moneytun.outbound.deserialize;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import java.io.IOException;
import java.time.format.DateTimeFormatter;

public class LocalDateTimeDeserialization extends JsonDeserializer<java.time.LocalDateTime> {

    @Override
    public java.time.LocalDateTime deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        java.time.LocalDateTime dateTime = java.time.LocalDateTime.parse(jsonParser.getText(), DateTimeFormatter.ISO_DATE_TIME);
        return dateTime;
    }

}
