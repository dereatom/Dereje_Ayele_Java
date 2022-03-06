package com.company;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class AddressTest {

    Address address;

    @Before
    public void setUp() throws Exception {
        address = new Address("11west", "12West", "Richmond", "VA", "23222");

    }

}
