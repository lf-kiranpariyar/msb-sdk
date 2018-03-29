package com.lftechnology.msb.sdk.enums;

public enum Gender {

    MALE("Male", "M"),
    FEMALE("Female", "F"),
    OTHER("Other", "O");

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
}
