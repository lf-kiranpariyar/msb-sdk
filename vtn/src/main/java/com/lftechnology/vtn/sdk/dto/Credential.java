package com.lftechnology.vtn.sdk.dto;

/**
 *
 * @author :shankar ghimire
 */


public class Credential {

    private static   String accessToken ="";
    private static String accessKey ="";

    /**
     * To set the value of accessToken and accessKey
     * This method should be called before calling actual api
     * @param token
     * @param key
     */
    public static void configure(String token, String key){
        accessToken = token;
        accessKey = key;

    }

    public static String getAccessToken() {
        return accessToken;
    }

    public static String getAccessKey() {
        return accessKey;
    }
}
