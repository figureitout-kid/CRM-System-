package com.techelevator.hr;
import com.techelevator.Billable;
import com.techelevator.Person;

import java.util.List;
import java.util.ArrayList;
import java.util.Map;

public class Customer extends Person implements Billable {
    private String phoneNumber;
    private List<Pet> pets = new ArrayList<>();

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public List<Pet> getPets() {
        return pets;
    }

    public void setPets(List<Pet> pets) {
        this.pets = pets;
    }
    public Customer(String firstName, String lastName, String phoneNumber){
        super(firstName, lastName);
        this.phoneNumber = phoneNumber;
    }
    /*Returns empty String*/
    public Customer(String firstName, String lastName){
        super(firstName, lastName);
        this.phoneNumber = "";
    }
    @Override
    public double getBalanceDue(Map<String, Double> servicesRendered){
        double balanceDue = 0.0;
        for(String service : servicesRendered.keySet()){
            balanceDue += servicesRendered.get(service);
        }
        return balanceDue;
    }
}
