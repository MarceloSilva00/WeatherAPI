/countries:

	GET : Returns a list of all the countries

	POST: Add’s a country
		Body:
			{
				"name": “[COUNTRYNAME]”
			}

	DELETE: Deletes a country
		Params:
			?country=[COUNTRYNAME]

/{country}/cities:

	GET : Returns a list of all the cities of a country

	POST: Add’s a city to the country
		Body:
			{
				"name”:”[CITYNAME]”,
				"latitude": [LATITUDE],
				"longitude": [LONGITUDE]
			}

	DELETE: Deletes a city
		Params:
			?city=[CITYNAME]


/{country}/{city}/records:

	GET : Returns a list of all records from a city

	POST: Add’s a record to a city
		Body:
			{
				"date": “[DATETIME]”, //2019-02-02T11:20:00Z
				"temp": [TEMP] //Double
			}
	
	DELETE: Deletes a record
		Params:
			?date=[DATETIME] //2019-02-02T11:20:00Z



/highest/{day}:

	GET: Returns a list of the 10 cities with the highest temp on a determinate day


/{country}/{city}/{day}:
	
	GET: Return the highest temp of a city on a determinate day

highest-temp/{days}:

	GET: Returns the highest temp until {days} back
