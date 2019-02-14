package com.marcelo.weather.domain;

import java.util.HashMap;
import java.util.Map;

public class Country {

    private String name;

    private Map<String,City> cities;

    public Country(String name) {
        this.name = name;
        this.cities = new HashMap<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Map<String,City> cities(){
        return cities;
    }

    public void addCity(String name, City city){
        cities.put(name,city);
    }

    @Override
    public String toString() {
        return "Country{" +
                "name='" + name + '\'' +
                ", cities=" + cities +
                '}';
    }
}
