package com.lftechnology.msb.moneytun.dto;

import com.google.gson.annotations.SerializedName;

public class Employee {

    @SerializedName("EmployeeCode")
    private String code;

    @SerializedName("EmployeePassword")
    private String password;

    public Employee(String code, String password) {
        this.code = code;
        this.password = password;
    }

    public Employee() {
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
