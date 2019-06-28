package com.lftechnology.gmt.dto;

/**
 * @author Kiran Pariyar <kiranpariyar@lftechnology.com>
 */
public class Credential {

    private String mtoName;
    private String mtoId;
    private String agentName;
    private String agentCode;
    private String agentUserId;
    private String agentPassword;
    private String agentSessionId;
    private String agentLocationId;

    public String getMtoName() {
        return mtoName;
    }

    public void setMtoName(String mtoName) {
        this.mtoName = mtoName;
    }

    public String getMtoId() {
        return mtoId;
    }

    public void setMtoId(String mtoId) {
        this.mtoId = mtoId;
    }

    public String getAgentName() {
        return agentName;
    }

    public void setAgentName(String agentName) {
        this.agentName = agentName;
    }

    public String getAgentCode() {
        return agentCode;
    }

    public void setAgentCode(String agentCode) {
        this.agentCode = agentCode;
    }

    public String getAgentUserId() {
        return agentUserId;
    }

    public void setAgentUserId(String agentUserId) {
        this.agentUserId = agentUserId;
    }

    public String getAgentPassword() {
        return agentPassword;
    }

    public void setAgentPassword(String agentPassword) {
        this.agentPassword = agentPassword;
    }

    public String getAgentSessionId() {
        return agentSessionId;
    }

    public void setAgentSessionId(String agentSessionId) {
        this.agentSessionId = agentSessionId;
    }

    public String getAgentLocationId() {
        return agentLocationId;
    }

    public void setAgentLocationId(String agentLocationId) {
        this.agentLocationId = agentLocationId;
    }
}
