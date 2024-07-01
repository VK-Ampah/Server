package keyinserver.services;

import keyinserver.model.Aircraft;
import keyinserver.model.Airport;
import keyinserver.model.City;
import keyinserver.model.Passenger;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AircraftService {
    private List<Aircraft> aircrafts = new ArrayList<>();

    // Initialize some data
    public AircraftService(PassengerService passengerService, AirportService airportService) {
        Aircraft aircraft1 = new Aircraft(1, "Boeing 737", "Delta", 160, new ArrayList<>(), new ArrayList<>());
        Aircraft aircraft2 = new Aircraft(2, "Airbus A320", "American Airlines", 150, new ArrayList<>(), new ArrayList<>());

        // Assigning passengers to aircrafts
        aircraft1.getPassengers().add(passengerService.findPassengerById(1));
        aircraft2.getPassengers().add(passengerService.findPassengerById(2));

        // Assigning airports to aircrafts
        aircraft1.getAirports().add(airportService.findAirportById(1));
        aircraft2.getAirports().add(airportService.findAirportById(2));

        // Adding aircrafts to lists
        aircrafts.add(aircraft1);
        aircrafts.add(aircraft2);

        // Adding aircrafts to passengers
        passengerService.findPassengerById(1).getAircrafts().add(aircraft1);
        passengerService.findPassengerById(2).getAircrafts().add(aircraft2);

        // Adding aircrafts to airports
        airportService.findAirportById(1).getAircrafts().add(aircraft1);
        airportService.findAirportById(2).getAircrafts().add(aircraft2);
    }

    // Method to add an aircraft
    public void addAircraft(Aircraft aircraft) {
        aircrafts.add(aircraft);
    }

    // Method to get all aircraft
    public List<Aircraft> getAllAircraft() {
        return aircrafts;
    }

    // Method to find an aircraft by ID
    public Aircraft findAircraftById(int id) {
        return aircrafts.stream().filter(a -> a.getId() == id).findFirst().orElse(null);
    }
}
