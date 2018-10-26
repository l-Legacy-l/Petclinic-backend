package be.heh.petclinic.component.vet;

import java.util.ArrayList;
import java.util.List;
import java.util.Collection;

import javax.sql.DataSource;

import be.heh.petclinic.domain.*;

class VetComponentImpl implements VetComponent {

    private JdbcVetDao vetDao;
  
    public VetComponentImpl(DataSource dataSource){
        vetDao = new JdbcVetDao(dataSource);
    }

    @Override
    public Collection<Vet> getVets() {
        List<Vet> vets = vetDao.getEvents();
        //vets.add(new Vet("James","James","none"));
        //vets.add(new Vet("Helen","Helen","radiology"));
        //vets.add(new Vet("Linda","Linda","surgery"));
        return vets;
    }


}