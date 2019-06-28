package com.lftechnology.gmt;

import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;

public class DateAdapter extends XmlAdapter<String, XMLGregorianCalendar> {

    private final SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
    // Unmarshal by converting the value type to a bound type.
    @Override
    public XMLGregorianCalendar unmarshal(String v) throws Exception {
        return DatatypeFactory.newInstance().newXMLGregorianCalendar(v);
    }

    // Marshal by converting the bound type to a value type.
    @Override
    public String marshal(XMLGregorianCalendar v) throws Exception {
        synchronized (dateFormat) {
            //return dateFormat.format(v);
            return specialFormatForXmlGregorianCalander(v);
        }
    }

    // Because you cannot format an XMLGregorianCalender typyou need to generate a GregorianCalender from it first
    private String specialFormatForXmlGregorianCalander(XMLGregorianCalendar calander){
        // Convert from XMLGregorianCalander to GregorianCalander
        GregorianCalendar gCalender = calander.toGregorianCalendar();

        // Get the date
        java.util.Date date = gCalender.getTime();

        //define the type of calendar to be GegorianCalander
        dateFormat.setCalendar(gCalender);

        // Return the string version
        return dateFormat.format(date);
    }
}