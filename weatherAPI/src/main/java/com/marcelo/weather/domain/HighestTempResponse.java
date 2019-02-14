package com.marcelo.weather.domain;

import java.util.Date;

public class HighestTempResponse {

    private String Country;
    private String city;
    private Date date;
    private double temp;

    public HighestTempResponse(String country, String city, Date date, double temp) {
        Country = country;
        this.city = city;
        this.date = date;
        this.temp = temp;
    }

    public String getCountry() {
        return Country;
    }

    public void setCountry(String country) {
        Country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public double getTemp() {
        return temp;
    }

    public void setTemp(double temp) {
        this.temp = temp;
    }
}
