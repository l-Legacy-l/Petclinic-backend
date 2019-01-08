package be.heh.petclinic.component.owner;

import java.util.ArrayList;
import java.util.List;
import java.util.Collection;

import javax.sql.DataSource;

import be.heh.petclinic.domain.*;

class OwnerComponentImpl implements OwnerComponent {

    private JdbcOwnerDao ownerDao;
  
    public OwnerComponentImpl(DataSource dataSource){
        ownerDao = new JdbcOwnerDao(dataSource);
    }

    @Override
    public Collection<Owner> getOwners() {
        List<Owner> owners = ownerDao.getEvents();
      
        return owners;
    }

    @Override
    public void addOwner(String firstname,String lastname, String address,String city,String telephone)
    {
        ownerDao.addOwner(firstname, lastname, address, city,telephone);
    }

    @Override
    public Collection<Owner> getOwnersBySearch(String search){
        List<Owner> owners = ownerDao.getOwnersBySearch(search);

        return owners;
    }

    @Override
    public Collection<Owner> getOwnerById(int id) {
        List<Owner> owners = ownerDao.getOwnerById(id);

        return owners;
    }

    @Override
    public void deleteOwner(int id) {
        ownerDao.deleteOwner(id);
    }

    @Override
    public void updateOwner(int id ,String firstname, String lastname, String address, String city, String telephone) {
        ownerDao.updateOwner(id, firstname, lastname, address, city,telephone);
    }
}