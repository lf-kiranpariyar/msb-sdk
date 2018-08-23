package com.lftechnology.msb.sdk.enums;

import com.google.common.collect.Maps;

import java.util.Map;

public enum Gender {

    MALE("male", "M"),
    FEMALE("female", "F"),
    OTHER("other", "O");

    private final String code;
    private final String gender;

    private Gender(String gender, String code) {
        this.code = code;
        this.gender = gender;
    }

    public String code() {
        return code;
    }

    public String gender() {
        return gender;
    }

    public static Gender forCode(String code) {
        switch (code) {
            case "M":
                return MALE;
            case "F":
                return FEMALE;
            case "O":
                return OTHER;
            default:
                return null;
        }
    }

    public static final Map<String, Gender> genderHashMap = Maps.newHashMapWithExpectedSize(Gender.values().length);

    static {
        for (Gender gen : Gender.values()) {
            genderHashMap.put(gen.gender, gen);
        }
    }

    public static Gender getGender(String value){
        return genderHashMap.get(value);
    }
}
