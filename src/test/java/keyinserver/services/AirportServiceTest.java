package keyinserver.services;

import keyinserver.model.Airport;
import keyinserver.model.City;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

public class AirportServiceTest {

    private AirportService airportService;
    private CityService cityService;

    @BeforeEach
    public void setUp() {
        cityService = new CityService();
        airportService = new AirportService(cityService);
    }

    @Test
    public void testAddAirport() {
        City city = cityService.findCityById(1);
        Airport airport = new Airport(3, "O'Hare", "ORD", city, null);
        airportService.addAirport(airport);
        assertEquals(3, airportService.getAllAirports().size());
    }

    @Test
    public void testGetAllAirports() {
        List<Airport> airports = airportService.getAllAirports();
        assertNotNull(airports);
        assertEquals(2, airports.size());
    }

    @Test
    public void testFindAirportById() {
        Airport airport = airportService.findAirportById(1);
        assertNotNull(airport);
        assertEquals("John F. Kennedy International Airport", airport.getName());
    }
}
