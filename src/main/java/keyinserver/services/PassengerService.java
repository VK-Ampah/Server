package keyinserver.services;


import keyinserver.model.Aircraft;
import keyinserver.model.City;
import keyinserver.model.Airport;
import keyinserver.model.Passenger;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class PassengerService {
    private List<Passenger> passengers = new ArrayList<>();

    // Initialize some data
    public PassengerService(CityService cityService) {
        City city1 = cityService.findCityById(1);
        Passenger passenger1 = new Passenger(1, "John", "Doe", "1234567890", city1, new ArrayList<>());
        Passenger passenger2 = new Passenger(2, "Jane", "Smith", "0987654321", city1, new ArrayList<>());
        passengers.add(passenger1);
        passengers.add(passenger2);
    }

    // Method to add a passenger
    public void addPassenger(Passenger passenger) {
        passengers.add(passenger);
    }

    // Method to get all passengers
    public List<Passenger> getAllPassengers() {
        return passengers;
    }

    // Method to find a passenger by ID
    public Passenger findPassengerById(int id) {
        return passengers.stream().filter(p -> p.getId() == id).findFirst().orElse(null);
    }

    // Method to get all aircraft a passenger has traveled on
    public List<Aircraft> getAircraftForPassenger(int passengerId) {
        Passenger passenger = findPassengerById(passengerId);
        return passenger != null ? passenger.getAircrafts() : null;
    }
}
