import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AirportTest {

    Airport airport;
    Plane plane,plane1,plane2;

    Hanger hanger,hanger1;

    @Before
    public void before(){
        airport = new Airport("GLA");
        plane = new Plane(PlaneType.BOEING747,"KLM");
        plane1 = new Plane(PlaneType.BOEING747,"KLM");
        plane2 = new Plane(PlaneType.BOEING747,"KLM");

        hanger = new Hanger();
        hanger1 = new Hanger();
    }

    @Test
    public void canGetCode(){
        assertEquals("GLA",airport.getCode());
    }

    @Test
    public void canGetCountOfHangers(){
        assertEquals(0,airport.hangerCount());
    }

    @Test
    public void canAddHanger(){
        airport.addHanger(hanger);
        assertEquals(1,airport.hangerCount());
    }

    @Test
    public void canAddPlane(){
        airport.addHanger(hanger);
        airport.addHanger(hanger1);

        airport.addPlane(plane);
        airport.addPlane(plane1);
        airport.addPlane(plane2);

        assertEquals(3,airport.returnAllPlaneCount());
    }

    @Test
    public void canGetPlaneFromHanger(){
        airport.addHanger(hanger);
        airport.addPlane(plane);
        assertEquals(1,airport.returnAllPlaneCount());
        airport.getPlane();
        assertEquals(0,airport.returnAllPlaneCount());
    }

    @Test
    public void canSellTicketFalse(){
        Passenger person = new Passenger("John");
        assertEquals(false,airport.sellTicket(person));

    }

    @Test
    public void canSellTicketTrue(){
        Passenger person = new Passenger("John");
        airport.addHanger(hanger);
        airport.addPlane(plane);
        assertEquals(true,airport.sellTicket(person));

    }
}
