package keyinserver.services;

import keyinserver.model.Aircraft;
import keyinserver.model.Airport;
import keyinserver.model.City;
import keyinserver.model.Passenger;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

import java.util.List;

@Service
public class AirportService {
    private final List<Airport> airports = new ArrayList<>();

    // Initialize some data
    public AirportService(CityService cityService) {
        City city1 = cityService.findCityById(1);
        Airport airport1 = new Airport(1, "John F. Kennedy International Airport", "JFK", city1, new ArrayList<>());
        Airport airport2 = new Airport(2, "Los Angeles International Airport", "LAX", cityService.findCityById(2), new ArrayList<>());
        airports.add(airport1);
        airports.add(airport2);

        // Adding airports to cities
        city1.getAirports().add(airport1);
        cityService.findCityById(2).getAirports().add(airport2);
    }

    // Method to add an airport
    public void addAirport(Airport airport) {
        airports.add(airport);
    }

    // Method to get all airports
    public List<Airport> getAllAirports() {
        return airports;
    }

    // Method to find an airport by ID
    public Airport findAirportById(int id) {
        return airports.stream().filter(a -> a.getId() == id).findFirst().orElse(null);
    }
}
