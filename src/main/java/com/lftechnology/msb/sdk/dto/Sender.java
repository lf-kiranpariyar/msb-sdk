package com.lftechnology.msb.sdk.dto;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Sender extends Person {

    String referenceId;
    String occupation;
    Address address;
    Contact contact;
    List<Document> documentList;

    //FIXME : Maybe Replace it with List Of Custom Object eg. CustomField which will hold key, value and mapping attibute
    private Map<String, Object> metadata = new HashMap<>();


    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Contact getContact() {
        return contact;
    }

    public void setContact(Contact contact) {
        this.contact = contact;
    }

    public List<Document> getDocumentList() {
        return documentList;
    }

    public void setDocumentList(List<Document> documentList) {
        this.documentList = documentList;
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

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }
}