package com.techelevator.crm;
import com.techelevator.hr.Pet;
import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;


public class PetTests {
    private Pet pet;
    @Before
    public void createNewPet() {
        this.pet = new Pet("Aurora", "dog");
        pet.getVaccinations().add("Parvo");
        pet.getVaccinations().add("Rabies");
        pet.getVaccinations().add("Distemper");
    }
    @Test
    public void vaccinationsListDisplay(){
        String expected = pet.listVaccinations();
        Assert.assertEquals("Parvo, Rabies, Distemper", expected);
    }

}
