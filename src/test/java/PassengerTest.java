import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PassengerTest {

    Passenger person1;

    @Before
    public void before(){
        person1 = new Passenger("John");
    }

    @Test
    public void canGetPassengerName(){
        assertEquals("John",person1.getName());
    }
}
