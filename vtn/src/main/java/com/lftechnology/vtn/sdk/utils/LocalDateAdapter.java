package com.lftechnology.vtn.sdk.utils;

import javax.xml.bind.annotation.adapters.XmlAdapter;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class LocalDateAdapter extends XmlAdapter<String, LocalDate> {

    @Override
    public String marshal(LocalDate date)
    {
        if ( date == null ) return null;
        return date.toString();
    }

    @Override
    public LocalDate unmarshal(String string)
    {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("M/d/yyyy");
            LocalDate date = LocalDate.parse(string, formatter);

        return date;
    }


}
