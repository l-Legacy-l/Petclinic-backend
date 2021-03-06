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
    public Collection<Visit> getVisitsByVetId(int vetId) {
        List<Visit> visits = visitDao.getVisitsByVetId(vetId);

        return visits;
    }

    @Override
    public void addVisit(String date, String description, int petId, int vetId) {

        visitDao.addVisit(date,description,petId,vetId);
    }

    @Override
    public void deleteVisit(int id) {
        visitDao.deleteVisit(id);
    }

	@Override
	public Collection<Visit> getVisitById(int id) {
		List<Visit> visits = visitDao.getVisitById(id);
        
        return visits;
	}

    @Override
    public Collection<Visit> getVisitsBySearch(String search) {
        List<Visit> visits = visitDao.getVisitsBySearch(search);
        
        return visits;
    }

    @Override
    public void updateVisit(int id, String date, String description, int petId, int vetId) {
        visitDao.updateVisit(id, date, description, petId, vetId);
    }


}