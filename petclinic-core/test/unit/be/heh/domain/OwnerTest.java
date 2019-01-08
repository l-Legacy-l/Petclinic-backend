package be.heh.domain;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import be.heh.petclinic.domain.Owner;

public class OwnerTest {

    @Test
    public void test_object_owner(){
        Owner owner = new Owner(1, "Nick", "Nick", "49 Rue de la Paix","Paris","0494012345");

        assertEquals(1,owner.getId());
        assertEquals("Nick",owner.getFirstname());
        assertEquals("Nick", owner.getLastname());
        assertEquals("49 Rue de la Paix",owner.getAddress());
        assertEquals("Paris", owner.getCity());
        assertEquals("0494012345", owner.getTelephone());
    }

}