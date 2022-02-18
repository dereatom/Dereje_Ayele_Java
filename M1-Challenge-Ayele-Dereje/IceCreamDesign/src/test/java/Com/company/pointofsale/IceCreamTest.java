package Com.company.pointofsale;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class IceCreamTest {

    IceCream iceCream;

    @Before
    public void setUp() {

        iceCream = new Com.company.pointofsale.IceCream("Vinela", 6, 12 );

    }

    @Test
    public void shouldReturnPriceMultiplyQuantity() {

        assertEquals(72.0, iceCream.getPriceMultiplyQuantity(), .0001);

    }
}