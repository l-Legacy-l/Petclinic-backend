package be.heh.petclinic.component.pet;

import java.util.ArrayList;
import java.util.List;
import java.util.Collection;

import javax.sql.DataSource;

import be.heh.petclinic.domain.*;

class PetComponentImpl implements PetComponent {

    private JdbcPetDao petDao;
    
  
    public PetComponentImpl(DataSource dataSource){
        petDao = new JdbcPetDao(dataSource); 
    }

    @Override
    public Collection<Pet> getPets() {
        List<Pet> pets = petDao.getPets();
   
        return pets;
    }

    @Override
    public Collection<Pet> getPetsType(String sort){
        List<Pet> pets = petDao.getPetType(sort);

        return pets;
    }

    @Override
    public void addPetById(String type, String name, String birthdate, int ownerId) {
        petDao.addPetById(type, name, birthdate, ownerId);
    }

    @Override
    public Collection<Pet> getPetsByOwnerId(int ownerId) {
        List<Pet> pets = petDao.getPetsByOwnerId(ownerId);

        return pets;
    }

    @Override
    public void deletePet(int id) {
        petDao.deletePet(id);

    }

    @Override
    public Collection<Pet> getPetById(int id) {
        List<Pet> pets = petDao.getPetById(id);

        return pets;
    }

}