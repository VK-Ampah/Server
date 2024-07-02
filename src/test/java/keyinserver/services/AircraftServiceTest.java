package keyinserver.services;


import keyinserver.model.Aircraft;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

public class AircraftServiceTest {

    private AircraftService aircraftService;
    private PassengerService passengerService;
    private AirportService airportService;
    private CityService cityService;

    @BeforeEach
    public void setUp() {
        cityService = new CityService();
        passengerService = new PassengerService(cityService);
        airportService = new AirportService(cityService);
        aircraftService = new AircraftService(passengerService, airportService);
    }

    @Test
    public void testAddAircraft() {
        Aircraft aircraft = new Aircraft(3, "Boeing 747", "United", 400, null, null);
        aircraftService.addAircraft(aircraft);
        assertEquals(3, aircraftService.getAllAircraft().size());
    }

    @Test
    public void testGetAllAircraft() {
        List<Aircraft> aircrafts = aircraftService.getAllAircraft();
        assertNotNull(aircrafts);
        assertEquals(2, aircrafts.size());
    }

    @Test
    public void testFindAircraftById() {
        Aircraft aircraft = aircraftService.findAircraftById(1);
        assertNotNull(aircraft);
        assertEquals("Boeing 737", aircraft.getType());
    }
}
