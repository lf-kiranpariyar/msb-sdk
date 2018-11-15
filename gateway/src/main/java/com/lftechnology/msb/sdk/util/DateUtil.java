package com.lftechnology.msb.sdk.util;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * MSB SDK Date Related Utils.
 */
public class DateUtil {

    public final static String ISO_DATE_FORMAT = "yyyy-MM-dd";


    /**
     * Returns Formatted @{@link String} date for given {@link LocalDate}.
     *
     * @param date   : {@link LocalDate}
     * @param format : Pattern for formatting provided date
     * @return String : Formatted date
     */
    public static String getDateString(LocalDate date, String format) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(format);
        return date.format(formatter);
    }


}
