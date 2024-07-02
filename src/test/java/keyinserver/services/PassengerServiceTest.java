package keyinserver.services;



import keyinserver.model.City;
import keyinserver.model.Passenger;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

public class PassengerServiceTest {

    private PassengerService passengerService;
    private CityService cityService;

    @BeforeEach
    public void setUp() {
        cityService = new CityService();
        passengerService = new PassengerService(cityService);
    }

    @Test
    public void testAddPassenger() {
        City city = cityService.findCityById(1);
        Passenger passenger = new Passenger(3, "Alice", "Johnson", "1122334455", city, null);
        passengerService.addPassenger(passenger);
        assertEquals(3, passengerService.getAllPassengers().size());
    }

    @Test
    public void testGetAllPassengers() {
        List<Passenger> passengers = passengerService.getAllPassengers();
        assertNotNull(passengers);
        assertEquals(2, passengers.size());
    }

    @Test
    public void testFindPassengerById() {
        Passenger passenger = passengerService.findPassengerById(1);
        assertNotNull(passenger);
        assertEquals("John", passenger.getFirstName());
    }
}

