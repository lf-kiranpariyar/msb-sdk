package com.lftechnology.vtn.adapter;

import javax.xml.bind.annotation.adapters.XmlAdapter;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * This class is used to convert date in string format to LocalDate
 *
 * @author shankar ghimire
 */

public class LocalDateAdapter extends XmlAdapter<String, LocalDate> {

    @Override
    public String marshal(LocalDate date) {
        if (date == null) return null;
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("M/d/yyyy");
        return date.format(formatter);
    }

    /**
     * This convert xml string to LocalDate
     *
     * @param string :string that is to be converted
     * @return LocalDate :date as LocalDate object
     */
    @Override
    public LocalDate unmarshal(String string) {

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("M/d/yyyy");
        LocalDate date = LocalDate.parse(string, formatter);

        return date;
    }


}
