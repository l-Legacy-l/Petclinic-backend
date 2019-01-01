package be.heh.domain;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import be.heh.petclinic.domain.Vet;

public class VetTest {

    @Test
    public void test_object_vet(){
        Vet vet = new Vet(1, "James", "James", "none");

        assertEquals("James",vet.getLastname());
        assertEquals("James",vet.getFirstname());
        assertEquals("none",vet.getSpeciality());
    }

}