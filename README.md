/countries:

        GET : Returns a list of all the countries

        POST: Adds a country
                Body:
                        {
                                "name":[COUNTRYNAME]
                        }

        DELETE: Deletes a country
                Params:
                        ?country=[COUNTRYNAME]

/{country}/cities:

        GET : Returns a list of all the cities of a country

        POST: Adds a city to the country
                Body:
                        {
                                "name":"[CITYNAME]",
                                "latitude": [LATITUDE],
                                "longitude": [LONGITUDE]
                                                              21,28-35       4%
