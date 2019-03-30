import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FlightTest {

    Flight flight;
    Plane plane;

    @Before
    public void before(){
        plane = new Plane(PlaneType.BOEING747,"KLM");
        flight = new Flight(plane,"GLA765","Glasgow");
    }

    @Test
    public void canGetPlane(){
        assertEquals(plane,flight.getPlane());
    }

    @Test
    public void canGetFlightNumber(){
        assertEquals("GLA765", flight.getFlightNumber());
    }

    @Test
    public void canGetDestination(){
        assertEquals("Glasgow",flight.getDestination());
    }

}
