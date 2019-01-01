package be.heh.domain;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import be.heh.petclinic.domain.Pet;

public class PetTest {

    @Test
    public void test_object_pet(){
        Pet pet = new Pet(1, "Chien", "Medor", "2016-04-12",3);

        assertEquals(1,pet.getId());
        assertEquals("Chien",pet.getType());
        assertEquals("Medor", pet.getName());
        assertEquals("2016-04-12",pet.getBirthdate());
        assertEquals(3, pet.getOwnerId());
    }

}