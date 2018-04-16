package com.lftechnology.msb.moneytun.dto;

import com.google.gson.Gson;
import com.lftechnology.msb.moneytun.constant.Constants;
import com.lftechnology.msb.moneytun.enums.ApiMode;
import com.lftechnology.msb.moneytun.exception.InvalidCredentialException;

import javax.ws.rs.BadRequestException;

public class APIContext {

    private Credential credential;

    private ApiMode mode;

    private String endPointUrl;

    public APIContext(String credentialString, ApiMode mode) {
        Gson gson = new Gson();
        if (credentialString == null) {
            throw new InvalidCredentialException("Credentials not found");
        }
        Credential credential=null;
        credential = gson.fromJson(credentialString, Credential.class);
        if(credential==null){
            throw new InvalidCredentialException("Invalid Credentials ");
        }
        this.credential = credential;
        this.mode = mode;
    }

    /**
     * Returns the access Token. Regenerates if null or expired.
     *
     * @return {@link String} of AccessToken
     * @throws InvalidCredentialException
     */
    public String getAccessCode() throws InvalidCredentialException {
        String accessToken = null;
        if (this.credential != null) {
            accessToken = this.credential.getAccessCode();
        }
        return accessToken;
    }

    /**
     * Returns the access Token. Regenerates if null or expired.
     *
     * @return {@link String} of AccessToken
     * @throws InvalidCredentialException
     */
    public String getSecretCode() throws InvalidCredentialException {
        String secretCode = null;
        if (this.credential != null) {
            secretCode = this.credential.getSecretCode();
        }
        return secretCode;
    }

    /**
     * Returns the access Token. Regenerates if null or expired.
     *
     * @return {@link String} of AccessToken
     * @throws InvalidCredentialException
     */
    public Employee getEmployeeDetail() throws InvalidCredentialException {
        Employee employee = new Employee();
        if (this.credential != null) {
            employee =new Employee(this.credential.getEmployeeId(), this.credential.getEmployeePassword());
        }
        return employee;
    }

    public Credential getCredential() {
        return credential;
    }

    public void setCredential(Credential credential) {
        this.credential = credential;
    }

    public ApiMode getMode() {
        return mode;
    }

    public void setMode(ApiMode mode) {
        this.mode = mode;
    }

    public String getEndPointUrl() {
        switch (mode){
            case LIVE:
                return Constants.LIVE_ENDPOINT;
            case SANDBOX:
                return Constants.SANDBOX_ENDPOINT;
            default:
                throw new BadRequestException("Invalid Mode or URL");
        }
    }

    public void setEndPointUrl(String endPointUrl) {
        this.endPointUrl = endPointUrl;
    }
}
