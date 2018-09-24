package com.lftechnology.vtn.sdk.dto;

import com.lftechnology.vtn.sdk.constants.CommonConstant;
import lombok.Data;

import javax.xml.bind.annotation.XmlElement;

@Data
public class Country {

    private String referenceId;
    private String name;
    private String threeCharCode;
    private String phoneCode;
    private Currency currency;

}
