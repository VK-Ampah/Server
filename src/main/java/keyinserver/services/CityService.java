package keyinserver.services;

import keyinserver.model.City;
import org.springframework.stereotype.Service;
import java.util.ArrayList;


import java.util.ArrayList;
import java.util.List;
@Service
public class CityService {
    private final List<City> cities = new ArrayList<>();

    // Initialize some data
    public CityService() {
        City city1 = new City(1, "New York", "NY", 8000000, new ArrayList<>());
        City city2 = new City(2, "Los Angeles", "CA", 4000000, new ArrayList<>());
        cities.add(city1);
        cities.add(city2);
    }

    // Method to add a city
    public void addCity(City city) {
        cities.add(city);
    }

    // Method to get all cities
    public List<City> getAllCities() {
        return cities;
    }

    // Method to find a city by ID
    public City findCityById(int id) {
        return cities.stream().filter(c -> c.getId() == id).findFirst().orElse(null);
    }
}
