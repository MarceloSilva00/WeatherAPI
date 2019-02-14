package com.marcelo.weather.domain;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class City {
    private String name;
    private Double latitude;
    private Double longitude;

    private Map<Date,Double> records;

    public City(String name, Double latitude, Double longitude) {
        this.name = name;
        this.latitude = latitude;
        this.longitude = longitude;
        records = new HashMap<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public void addRecord(Date d, Double t){
        records.put(d,t);
    }

    public Map<Date,Double> getRecords(){
        return records;
    }

    public Double getRecordByDate(Date date){
        return records.get(date);
    }

    @Override
    public String toString() {
        return "City{" +
                "name='" + name + '\'' +
                ", latitude=" + latitude +
                ", longitude=" + longitude +
                '}';
    }
}
