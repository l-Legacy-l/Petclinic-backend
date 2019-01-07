package be.heh.petclinic.component.vet;

import be.heh.petclinic.domain.Vet;

import java.util.List;

import java.util.Collection;

public interface VetComponent{

    Collection<Vet> getVets();
    Collection<Vet> getVetsSpeciality(String spec);
    Collection<Vet> getVetById(int id);
    void addVet(String lastname, String firstname, String speciality);
    void updateVet(int id,String lastname, String firstname, String speciality);
    void deleteVet(int id);
    
}