package Com.company.factory;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class IceCreamTest {

    IceCream iceCream;
    @Before
    public  void setUp(){
        iceCream = new IceCream("Straberry", 45.05, 12.45,
                12, new String[]{"milk", "egg", "Blackberry"});
        return;
    }

    @Test
    public void shouldReturnProductionCostOverTime() {
        assertEquals(149.4, iceCream.getProductionCostOverTime(), 0.001);

    }

}