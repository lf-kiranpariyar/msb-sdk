package com.lftechnology.vtn.sdk.dto;

import lombok.Data;

@Data
public class Country {

    private String referenceId;
    private String name;
    private String threeCharCode;
    private String phoneCode;
    private Currency currency;

}
