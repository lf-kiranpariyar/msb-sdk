package com.lftechnology.vtn.sdk.utils;

import javax.xml.bind.annotation.adapters.XmlAdapter;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class LocalDateTimeAdapter extends XmlAdapter<String , LocalDateTime> {

    @Override
    public String marshal(LocalDateTime date) {
        if (date == null) return null;
        return date.toString();
    }

    /**
     *
     * This convert xml string to LocalDate
     * @param string :string that is to be converted
     * @return LocalDate :date as LocalDate object
     */
    @Override
    public LocalDateTime unmarshal(String string) {


        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("M/d/yyyy h:mm:ss a", Locale.getDefault());
        LocalDateTime date = LocalDateTime.parse(string, formatter);
        return date;
    }
}
