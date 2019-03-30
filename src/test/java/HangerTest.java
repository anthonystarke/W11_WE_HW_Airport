import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HangerTest {

    Plane plane1;
    Hanger hanger1;


    @Before
    public void before(){
        plane1 = new Plane(PlaneType.BOEING747,"KLM");
        hanger1 = new Hanger();
    }

    @Test
    public void returnPlaneCount(){
        assertEquals(0,hanger1.returnPlaneCount());
    }

    @Test
    public void addPlaneToHanger(){
        hanger1.addPlane(plane1);
        assertEquals(1,hanger1.returnPlaneCount());
    }

    @Test
    public void getAPlane(){
        Plane plane2;

        hanger1.addPlane(plane1);
        assertEquals(1,hanger1.returnPlaneCount());
        plane2 = hanger1.getPlane();
        assertEquals(0,hanger1.returnPlaneCount());
    }
}
