package keyinserver.services;


import keyinserver.model.City;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

public class CityServiceTest {

    private CityService cityService;

    @BeforeEach
    public void setUp() {
        cityService = new CityService();
    }

    @Test
    public void testAddCity() {
        City city = new City(3, "Chicago", "IL", 2700000, null);
        cityService.addCity(city);
        assertEquals(3, cityService.getAllCities().size());
    }

    @Test
    public void testGetAllCities() {
        List<City> cities = cityService.getAllCities();
        assertNotNull(cities);
        assertEquals(2, cities.size());
    }

    @Test
    public void testFindCityById() {
        City city = cityService.findCityById(1);
        assertNotNull(city);
        assertEquals("New York", city.getName());
    }
}

