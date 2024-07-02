package keyinserver.model;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AircraftTest {

    @Test
    public void testAircraftGettersAndSetters() {
        Aircraft aircraft = new Aircraft(1, "Boeing 737", "Delta", 160, null, null);

        assertEquals(1, aircraft.getId());
        assertEquals("Boeing 737", aircraft.getType());
        assertEquals("Delta", aircraft.getAirlineName());
        assertEquals(160, aircraft.getNumberOfPassengers());
    }
}

