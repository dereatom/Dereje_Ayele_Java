package com.company;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CustomerTest {

    Customer customer;
    @Before
    public void setUp() throws Exception {

        customer = new Customer("Marry", "Aaron", "aaron@gmail.com",
                "1111111111","11west,12West, Richmond, VA, 23222",
                "13west,12West, Richmond, VA, 23222", true);
    }

    @Test
    public void isRewardedMember () {
        assertEquals(true, customer.isRewardMember());

    }

}