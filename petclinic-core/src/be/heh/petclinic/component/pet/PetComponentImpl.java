package be.heh.petclinic.component.pet;

import java.util.ArrayList;
import java.util.List;
import java.util.Collection;

import javax.sql.DataSource;

import be.heh.petclinic.domain.*;

class PetComponentImpl implements PetComponent {

    private JdbcPetDao petDao;
  
    public PetComponentImpl(DataSource dataSource){
        petDao = new JdbcpetDao(dataSource);
    }

    @Override
    public Collection<Pet> getPets() {
        List<Pet> pets = PetDao.getEvents();
        //vets.add(new Vet("James","James","none"));
        //vets.add(new Vet("Helen","Helen","radiology"));
        //vets.add(new Vet("Linda","Linda","surgery"));
        return pets;
    }


}