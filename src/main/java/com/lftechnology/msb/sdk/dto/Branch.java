package com.lftechnology.msb.sdk.dto;

import java.util.HashMap;
import java.util.Map;

public class Branch {

    private String name;
    private String referenceId;
    private Map<String, Object> metadata = new HashMap<>();


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getReferenceId() {
        return referenceId;
    }

    public void setReferenceId(String referenceId) {
        this.referenceId = referenceId;
    }

    public Map<String, Object> getMetadata() {
        return metadata;
    }

    public void setMetadata(Map<String, Object> metadata) {
        this.metadata = metadata;
    }
}
