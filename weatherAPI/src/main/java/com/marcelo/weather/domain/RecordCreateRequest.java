package com.marcelo.weather.domain;

public class RecordCreateRequest {

    private String date;
    private Double temp;

    public RecordCreateRequest(String date, Double temp) {
        this.date = date;
        this.temp = temp;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Double getTemp() {
        return temp;
    }

    public void setTemp(Double temp) {
        this.temp = temp;
    }
}
