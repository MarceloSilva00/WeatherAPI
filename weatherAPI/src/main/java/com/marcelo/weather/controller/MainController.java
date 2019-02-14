package com.marcelo.weather.controller;

import com.marcelo.weather.domain.*;
import org.springframework.web.bind.annotation.*;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.Instant;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAccessor;
import java.util.*;

@RestController
@RequestMapping
public class MainController {


    Map<String, Country> countries;

    public MainController() {
        this.countries = new HashMap<>();
        init();
    }


    public void init() {
        City c1 = new City("Porto", 41.1579, 8.6291);
            c1.addRecord(convertToDateTime("2019-02-08T08:00:00Z"), 17.4D);
            c1.addRecord(convertToDateTime("2019-02-08T16:00:00Z"), 22.4D);
            c1.addRecord(convertToDateTime("2019-02-09T08:00:00Z"), 14.2D);
            c1.addRecord(convertToDateTime("2019-02-09T16:00:00Z"), 20.3D);
            c1.addRecord(convertToDateTime("2019-02-10T08:00:00Z"), 19.7D);
            c1.addRecord(convertToDateTime("2019-02-10T16:00:00Z"), 24.3D);
            c1.addRecord(convertToDateTime("2019-02-11T08:00:00Z"), 14.2D);
            c1.addRecord(convertToDateTime("2019-02-11T16:00:00Z"), 20.3D);
            c1.addRecord(convertToDateTime("2019-02-12T08:00:00Z"), 13.4D);
            c1.addRecord(convertToDateTime("2019-02-12T16:00:00Z"), 27.4D);
            c1.addRecord(convertToDateTime("2019-02-13T08:00:00Z"), 5.4D);
            c1.addRecord(convertToDateTime("2019-02-13T16:00:00Z"), 30.4D);
            c1.addRecord(convertToDateTime("2019-02-14T08:00:00Z"), 14.2D);
            c1.addRecord(convertToDateTime("2019-02-14T16:00:00Z"), 20.3D);

        City c2 = new City("Lisboa", 38.7223, 9.1393);
            c2.addRecord(convertToDateTime("2019-02-08T08:00:00Z"), 6.4D);
            c2.addRecord(convertToDateTime("2019-02-08T16:00:00Z"), 16.4D);
            c2.addRecord(convertToDateTime("2019-02-09T08:00:00Z"), 4.2D);
            c2.addRecord(convertToDateTime("2019-02-09T16:00:00Z"), 13.3D);
            c2.addRecord(convertToDateTime("2019-02-10T08:00:00Z"), 19.7D);
            c2.addRecord(convertToDateTime("2019-02-10T16:00:00Z"), 28.3D);
            c2.addRecord(convertToDateTime("2019-02-11T08:00:00Z"), 14.2D);
            c2.addRecord(convertToDateTime("2019-02-11T16:00:00Z"), 20.3D);
            c2.addRecord(convertToDateTime("2019-02-12T08:00:00Z"), 9.4D);
            c2.addRecord(convertToDateTime("2019-02-12T16:00:00Z"), 17.4D);
            c2.addRecord(convertToDateTime("2019-02-13T08:00:00Z"), 5.4D);
            c2.addRecord(convertToDateTime("2019-02-13T16:00:00Z"), 20.4D);
            c2.addRecord(convertToDateTime("2019-02-14T08:00:00Z"), 7.2D);
            c2.addRecord(convertToDateTime("2019-02-14T16:00:00Z"), 20.3D);

        Country portugal = new Country("Portugal");
        portugal.addCity("porto", c1);
        portugal.addCity("lisboa", c2);
        countries.put("portugal", portugal);

        City c3 = new City("Madrid", 40.4168, 40.4168);
            c3.addRecord(convertToDateTime("2019-02-08T08:00:00Z"), 1.2D);
            c3.addRecord(convertToDateTime("2019-02-08T16:00:00Z"), 17.4D);
            c3.addRecord(convertToDateTime("2019-02-09T08:00:00Z"), 10.5D);
            c3.addRecord(convertToDateTime("2019-02-09T16:00:00Z"), 40.7D);
            c3.addRecord(convertToDateTime("2019-02-10T08:00:00Z"), 12.8D);
            c3.addRecord(convertToDateTime("2019-02-10T16:00:00Z"), 25.0D);
            c3.addRecord(convertToDateTime("2019-02-11T08:00:00Z"), 09.1D);
            c3.addRecord(convertToDateTime("2019-02-11T16:00:00Z"), 20.5D);
            c3.addRecord(convertToDateTime("2019-02-12T08:00:00Z"), 11.6D);
            c3.addRecord(convertToDateTime("2019-02-12T16:00:00Z"), 28.3D);
            c3.addRecord(convertToDateTime("2019-02-13T08:00:00Z"), 08.8D);
            c3.addRecord(convertToDateTime("2019-02-13T16:00:00Z"), 30.4D);
            c3.addRecord(convertToDateTime("2019-02-14T08:00:00Z"), 00.8D);
            c3.addRecord(convertToDateTime("2019-02-14T16:00:00Z"), 40.2D);

        City c4 = new City("Barcelona", 41.3851, 2.1734);
            c4.addRecord(convertToDateTime("2019-02-08T08:00:00Z"), 6.4D);
            c4.addRecord(convertToDateTime("2019-02-08T16:00:00Z"), 16.4D);
            c4.addRecord(convertToDateTime("2019-02-09T08:00:00Z"), 4.2D);
            c4.addRecord(convertToDateTime("2019-02-09T16:00:00Z"), 13.3D);
            c4.addRecord(convertToDateTime("2019-02-10T08:00:00Z"), 19.7D);
            c4.addRecord(convertToDateTime("2019-02-10T16:00:00Z"), 28.3D);
            c4.addRecord(convertToDateTime("2019-02-11T08:00:00Z"), 14.2D);
            c4.addRecord(convertToDateTime("2019-02-11T16:00:00Z"), 20.3D);
            c4.addRecord(convertToDateTime("2019-02-12T08:00:00Z"), 9.4D);
            c4.addRecord(convertToDateTime("2019-02-12T16:00:00Z"), 17.4D);
            c4.addRecord(convertToDateTime("2019-02-13T08:00:00Z"), 5.4D);
            c4.addRecord(convertToDateTime("2019-02-13T16:00:00Z"), 20.4D);
            c4.addRecord(convertToDateTime("2019-02-14T08:00:00Z"), 7.2D);
            c4.addRecord(convertToDateTime("2019-02-14T16:00:00Z"), 20.3D);

        Country espanha = new Country("Espanha");
        espanha.addCity("madrid", c3);
        espanha.addCity("barcelona", c4);
        countries.put("espanha", espanha);
    }

    //COUNTRIES

    //LIST ALL COUNTRIES
    @GetMapping("/countries")
    public Iterable<Country> showAllCountries() {
        return countries.values();
    }

    //ADD COUNTRY
    @PostMapping("/countries")
    public void addCountry(@RequestBody CountryCreateRequest country) {
        countries.put(country.getName().toLowerCase(), new Country(country.getName()));
    }

    //DELETE COUNTRY
    @DeleteMapping("/countries")
    public void deleteCountry(@PathVariable(value = "name") String country) {
        if (countries.containsKey(country)) {
            countries.remove(country);
        }
    }

    //CITIES

    //LIST OF ALL CITIES ON A COUNTRY
    @GetMapping("/{country}/cities")
    public Iterable<City> showAllCitysOfCountry(@PathVariable(value = "country") String c) {
        if (countries.containsKey(c)) {

            return countries.get(c).cities().values();
        } else {
            return null;
        }
    }

    //ADD CITY TO A COUNTRY
    @PostMapping("/{country}/cities")
    public void addCityToCountry(@PathVariable(value = "country") String country, @RequestBody CityCreateRequest cityCreateRequest) {
        if (countries.containsKey(country)) {
            Country c = countries.get(country);
            c.addCity(cityCreateRequest.getName().toLowerCase(), new City(cityCreateRequest.getName(), cityCreateRequest.getLatitude(), cityCreateRequest.getLongitude()));
        }
    }

    //DELETE A CITY
    @DeleteMapping("/{country}/cities")
    public void deleteCityFromCountry(@PathVariable(value = "country") String country, @PathVariable("name") String city) {
        if (countries.containsKey(country)) {
            Country c = countries.get(country);
            c.cities().remove(city);
        }
    }

    // RECORDS

    //GET ALL RECORDS OF A CITY
    @GetMapping("/{country}/{city}/records")
    public Iterable<Map.Entry<Date, Double>> showAllRecordOfCity(@PathVariable(value = "country") String country, @PathVariable(value = "city") String city) {
        if (countries.containsKey(country)) {
            Country c = countries.get(country);
            if (c.cities().containsKey(city)) {
                return c.cities().get(city).getRecords().entrySet();
            }
        }
        return null;
    }

    //ADD A RECORD TO A CITY
    @PostMapping("/{country}/{city}/records")
    public void showAllRecordOfCity(@PathVariable(value = "country") String country, @PathVariable(value = "city") String city, @RequestBody RecordCreateRequest rcr) {
        if (countries.containsKey(country)) {
            Country c = countries.get(country);
            if (c.cities().containsKey(city)) {
                City ci = c.cities().get(city);
                ci.addRecord(convertToDateTime(rcr.getDate()), rcr.getTemp());
            }
        }
    }

    //DELETES RECORD FROM A CITY
    @DeleteMapping("/{country}/{city}/records")
    public void deleteRecordFromCity(@PathVariable(value = "country") String country, @PathVariable(value = "city") String city, @RequestParam(value = "date") String date) {
        if (countries.containsKey(country)) {
            Country c = countries.get(country);
            if (c.cities().containsKey(city)) {
                City ci = c.cities().get(city);
                ci.getRecords().remove(convertToDateTime(date));
            }
        }

    }

    //CUSTOM

    // LIST THE TOP 10 HIGHEST CITIES ON A DAY
    @GetMapping("/highest/{day}")
    public Iterable<HighestTempResponse> getListOfHighestOfADay(@PathVariable(value = "day") String dayS) throws
            ParseException {
        Date day = convertToDate(dayS);

        List<HighestTempResponse> list = new LinkedList<>();

        for (Country c : countries.values()) {
            for (City ci : c.cities().values()) {
                Date maxD = null;
                Double maxT = 0D;
                for (Map.Entry<Date, Double> e : ci.getRecords().entrySet()) {
                    if (compareDates(day, e.getKey()) == 0) {
                        if (e.getValue() > maxT) {
                            maxD = e.getKey();
                            maxT = e.getValue();
                        }
                    }
                }
                if (maxD != null) {
                    list.add(new HighestTempResponse(c.getName(), ci.getName(), maxD, maxT));
                }
            }
        }

        list.sort((o1, o2) -> {
            if (o1.getTemp() == o2.getTemp()) {
                return 0;
            } else if (o1.getTemp() > o2.getTemp()) {
                return -1;
            } else {
                return 1;
            }
        });

        if (list.size() > 10) {
            return list.subList(0, 10);
        }
        return list;
    }

    //SEARCHES HIGHEST TEMP OF A CITY ON A DAY
    @GetMapping("/{country}/{city}/{day}")
    public HighestTempResponse getHighestTempOfDay(@PathVariable(value = "country") String
                                                           country, @PathVariable(value = "city") String city, @PathVariable(value = "day") String dateS) throws
            ParseException {

        Date day = convertToDate(dateS);
        if (countries.containsKey(country)) {
            Country c = countries.get(country);
            if (c.cities().containsKey(city)) {
                City ci = c.cities().get(city);
                Date maxD = null;
                Double maxT = 0D;
                for (Map.Entry<Date, Double> e : ci.getRecords().entrySet()) {
                    if (compareDates(day, e.getKey()) == 0) {
                        maxD = e.getKey();
                        maxT = e.getValue();
                    }
                }
                return new HighestTempResponse(c.getName(), ci.getName(), maxD, maxT);
            }
            return null;
        }
        return null;
    }

    //CITY WITH THE HIGHEST TEMP ON X DAYS BEFORE TODAY
    @GetMapping("highest-temp/{days}")
    public HighestTempResponse getHighestTempOfXDays(@PathVariable(value = "days") int days) {
        Instant now = Instant.now(); //current date
        Instant before = now.minus(Duration.ofDays(days));
        Date dateBefore = Date.from(before);

        String maxCo = null;
        String maxCi = null;
        Date maxD = null;
        double maxT = 0;
        for (Country c : countries.values()) {
            for (City ci : c.cities().values()) {
                for (Map.Entry<Date, Double> e : ci.getRecords().entrySet()) {
                    if (e.getKey().after(dateBefore)) {
                        if (e.getValue() > maxT) {
                            maxCo = c.getName();
                            maxCi = ci.getName();
                            maxD = e.getKey();
                            maxT = e.getValue();
                        }
                    }
                }
            }
        }
        return new HighestTempResponse(maxCo, maxCi, maxD, maxT);
    }


    public static Date convertToDateTime(String date) {// "2011-12-03T10:15:30Z"
        DateTimeFormatter a = DateTimeFormatter.ISO_INSTANT;
        TemporalAccessor t = a.parse(date);
        return Date.from(Instant.from(t));
    }

    public static Date convertToDate(String date) throws ParseException {//
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        return format.parse(date);
    }

    private static final ThreadLocal<DateFormat> dateFormatThreadLocal = ThreadLocal.withInitial(() -> new SimpleDateFormat("yyyyMMdd"));

    public static int compareDates(Date date1, Date date2) {
        DateFormat dateFormat = dateFormatThreadLocal.get();
        return dateFormat.format(date1).compareTo(dateFormat.format(date2));
    }
}
