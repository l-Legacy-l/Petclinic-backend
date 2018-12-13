package be.heh.petclinic.component.pet;

import be.heh.petclinic.domain.Pet;

import java.util.List;

import java.util.Collection;

public interface PetComponent{

    Collection<Pet> getPets();
    Collection<Pet> getPetsType(String sort);
    void addPetById(String type, String name, String birthdate, int ownerId);
    Collection<Pet> getPetByOwnerId(int ownerId);
    Collection<Pet> getPetById(int id);
    void deletePet(int id);

}