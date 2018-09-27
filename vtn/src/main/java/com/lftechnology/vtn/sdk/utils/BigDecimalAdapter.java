package com.lftechnology.vtn.sdk.utils;

import javax.xml.bind.annotation.adapters.XmlAdapter;
import java.math.BigDecimal;

/**
 *  The type that JAXB doesn't know how to handle,
 *  This Adapter class is used to convert currency in String format to bigdecimal
 *
 * @author shankar ghimire
 */

public class BigDecimalAdapter extends XmlAdapter<String, BigDecimal> {
    /**
     * This convert xml string format to bigdecimal
     * @param string : string that is to be converted to Bigdecimal
     * @return BigDecimal : currency value in decimal
     * @throws Exception
     */


    @Override
    public BigDecimal unmarshal(String string) throws Exception {

        System.out.println(string);
        BigDecimal decimalCurrency = new BigDecimal(string.replaceAll(",", ""));
        System.out.println(decimalCurrency);
        return decimalCurrency;
    }

    @Override
    public String marshal(BigDecimal v) throws Exception {
        return null;
    }

}
