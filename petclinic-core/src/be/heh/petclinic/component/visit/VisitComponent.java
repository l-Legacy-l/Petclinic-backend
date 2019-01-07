package be.heh.petclinic.component.visit;

import be.heh.petclinic.domain.Visit;

import java.util.Collection;

public interface VisitComponent{

    Collection<Visit> getVisits();
    Collection<Visit> getVisitsByPetId(int petId);
    Collection<Visit> getVisitsByVetId(int vetId);
    void addVisit(String date, String description,int petId, int vetId);
    Collection<Visit> getVisitById(int id);
    Collection<Visit> getVisitsBySearch(String search);
    void deleteVisit(int id);
    void updateVisit(int id, String date, String description, int petId, int vetId);
}