package be.heh.petclinic.component.visit;

import be.heh.petclinic.domain.Visit;

import java.util.Collection;

public interface VisitComponent{

    Collection<Visit> getVisits();
    Collection<Visit> getVisitsByPetId(int petId);
    void addVisitByPetId(int petId);


}