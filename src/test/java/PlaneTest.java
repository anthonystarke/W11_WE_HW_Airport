import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlaneTest {

    Plane plane;
    Passenger person1;

    @Before
    public void before(){
        plane = new Plane(PlaneType.BOEING747,"KLM");
        person1 = new Passenger("John");
    }

    @Test
    public void returnPlaneType(){
        assertEquals(PlaneType.BOEING747,plane.returnType());
    }

    @Test
    public void returnPlaneAirline(){
        assertEquals("KLM",plane.returnAirline());
    }

    @Test
    public void returnPassengerCount(){
        assertEquals(0,plane.passengerCount());
    }

    @Test
    public void addPassenger(){
        plane.addPassenger(person1);
        assertEquals(1,plane.passengerCount());
    }

    @Test
    public void removePassenger(){
        plane.addPassenger(person1);
        assertEquals(1,plane.passengerCount());
        plane.removePassenger(person1);
        assertEquals(0,plane.passengerCount());

    }

}
