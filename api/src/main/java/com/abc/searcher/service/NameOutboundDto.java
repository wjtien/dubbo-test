package com.abc.searcher.service;


import java.io.Serializable;

public class NameOutboundDto implements Serializable {
    private String organizationId;
    private String organizationName;

    public String getOrganizationId() {return this.organizationId;}

    public String getOrganizationName() {return this.organizationName;}

    public void setOrganizationId(String organizationId) {this.organizationId = organizationId; }

    public void setOrganizationName(String organizationName) {this.organizationName = organizationName; }
}
