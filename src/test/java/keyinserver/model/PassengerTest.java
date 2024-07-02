package keyinserver.model;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PassengerTest {

    @Test
    public void testPassengerGettersAndSetters() {
        Passenger passenger = new Passenger(1, "John", "Doe", "1234567890", null, null);

        assertEquals(1, passenger.getId());
        assertEquals("John", passenger.getFirstName());
        assertEquals("Doe", passenger.getLastName());
        assertEquals("1234567890", passenger.getPhoneNumber());
    }
}

