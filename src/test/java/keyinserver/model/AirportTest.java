package keyinserver.model;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AirportTest {

    @Test
    public void testAirportGettersAndSetters() {
        Airport airport = new Airport(1, "JFK", "JFK", null, null);

        assertEquals(1, airport.getId());
        assertEquals("JFK", airport.getName());
        assertEquals("JFK", airport.getCode());
    }
}

