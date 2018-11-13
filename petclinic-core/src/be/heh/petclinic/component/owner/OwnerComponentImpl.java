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
}
