package be.heh.domain;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import be.heh.petclinic.domain.Visit;

public class VisitTest {

    @Test
    public void test_object_Visit(){
        Visit visit = new Visit(1, "2012-12-24", "description de visite 1", 4,2);
        assertEquals(1,visit.getId());
        assertEquals("2012-12-24",visit.getDate());
        assertEquals("description de visite 1",visit.getDescription());
        assertEquals(4,visit.getPetId());
        assertEquals(2, visit.getVetId());
    }

}