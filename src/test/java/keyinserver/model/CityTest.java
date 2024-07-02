package keyinserver.model;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CityTest {

    @Test
    public void testCityGettersAndSetters() {
        City city = new City(1, "New York", "NY", 8000000, null);

        assertEquals(1, city.getId());
        assertEquals("New York", city.getName());
        assertEquals("NY", city.getState());
        assertEquals(8000000, city.getPopulation());
    }
}
