package be.heh.petclinic.component.visit;

import java.util.List;
import java.util.Collection;

import javax.sql.DataSource;

import be.heh.petclinic.domain.*;

class VisitComponentImpl implements VisitComponent {

    private JdbcVisitDao visitDao;
  
    public VisitComponentImpl(DataSource dataSource){
        visitDao = new JdbcVisitDao(dataSource);
    }

    @Override
    public Collection<Visit> getVisits() {
        List<Visit> visits = visitDao.getVisits();
        return visits;
    }

    @Override
    public Collection<Visit> getVisitsByPetId(int petId) {

        List<Visit> visits = visitDao.getVisitsByPetId(petId);
        return visits;
    }


    @Override
    public void addVisit(String date, String description, int petId) {

        visitDao.addVisit(date,description,petId);
    }


}