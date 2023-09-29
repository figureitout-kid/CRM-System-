package com.techelevator.crm;

import com.techelevator.hr.Customer;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;



public class CustomerTests {
    private Customer customer;
    private Map<String, Double> servicesRendered;

    @Before
    public void createCustomer() {
        this.customer = new Customer("William", "Afton");

    }
    @Test
    public void checkBalance(){
        Map<String, Double> servicesRendered = new HashMap<>();
        servicesRendered.put("Walking", 20.00);
        servicesRendered.put("Grooming", 50.00);
        servicesRendered.put("Sitting", 100.00);
        String expected  = String.valueOf(customer.getBalanceDue(servicesRendered));
        Assert.assertEquals("170.0", expected);
    }
}
