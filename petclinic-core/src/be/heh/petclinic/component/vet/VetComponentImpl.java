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
        
        return vets;
    }

    @Override
    public Collection<Vet> getVetsSpeciality(String spec) {
        List<Vet> vets = vetDao.getVetSpeciality(spec);
        
        return vets;
    }

    @Override
    public Collection<Vet> getVetById(int id) {
        return null;
    }

    @Override
    public void addVet(String lastname, String firstname, String speciality) {
        vetDao.addVet(lastname, firstname, speciality);
    }

    @Override
    public void updateVet(int id, String lastname, String firstname, String speciality) {

    }

    @Override
    public void deleteVet(int id) {
        vetDao.deleteVet(id);
    }


}