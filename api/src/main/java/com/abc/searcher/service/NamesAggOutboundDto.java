package com.abc.searcher.service;


import java.util.List;

public class NamesAggOutboundDto {
    private  String words;
    private  List<NameOutboundDto> organizations;

    public NamesAggOutboundDto() {
    }

    public NamesAggOutboundDto(String words, List<NameOutboundDto> organizations) {
        this.words = words;
        this.organizations = organizations;
    }

    public String getWords() {
        return words;
    }

    public void setWords(String words) {
        this.words = words;
    }

    public List<NameOutboundDto> getOrganizations() {
        return organizations;
    }

    public void setOrganizations(List<NameOutboundDto> organizations) {
        this.organizations = organizations;
    }

}
