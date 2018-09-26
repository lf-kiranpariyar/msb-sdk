package com.lftechnology.vtn.sdk.utils;

import javax.xml.bind.annotation.adapters.XmlAdapter;
import java.math.BigDecimal;

public class BigDecimalAdapter extends XmlAdapter<String, BigDecimal> {
    @Override
    public BigDecimal unmarshal(String string) throws Exception {

        BigDecimal decimalCurrency = new BigDecimal(string.replaceAll(",", ""));
        return decimalCurrency;
    }

    @Override
    public String marshal(BigDecimal v) throws Exception {
        return null;
    }
}
