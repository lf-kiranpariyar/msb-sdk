package com.lftechnology.msb.sdk.dto;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Stores Recipient Information.
 */

public class Recipient extends Person{

    private String referenceId;
    private Address address;
    private Contact contact;
    private List<Document> documentList;
    private String relationship;


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

    public String getRelationship() {
        return relationship;
    }

    public void setRelationship(String relationship) {
        this.relationship = relationship;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Recipient{");
        sb.append("referenceId='").append(referenceId).append('\'');
        sb.append(", address=").append(address);
        sb.append(", contact=").append(contact);
        sb.append(", documentList=").append(documentList);
        sb.append(", metadata=").append(metadata);
        sb.append('}');
        return sb.toString();
    }
}
