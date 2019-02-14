package com.marcelo.weather.domain;

public class CountryCreateRequest {
    private String name;

    public CountryCreateRequest(String name) {
        this.name = name;
    }

    public CountryCreateRequest() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
