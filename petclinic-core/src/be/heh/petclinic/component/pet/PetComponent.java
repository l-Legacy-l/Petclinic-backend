package be.heh.petclinic.component.pet;

import be.heh.petclinic.domain.Pet;

import java.util.List;

import java.util.Collection;

public interface PetComponent{

    Collection<Pet> getPets();
    Collection<Pet> getPetsType(String sort);

    void addPet(String type, String name, String birthdate, String ownerFirstname, String ownerLastname);
}