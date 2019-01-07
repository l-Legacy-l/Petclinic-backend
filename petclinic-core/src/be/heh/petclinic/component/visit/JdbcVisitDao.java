package be.heh.petclinic.component.visit;

import org.springframework.jdbc.core.JdbcTemplate;


import be.heh.petclinic.domain.Visit;
import java.util.List;

import javax.sql.DataSource;

public class JdbcVisitDao {
    //Classe pour se connecter à la BDD et récupérer les données

    private DataSource dataSource;

    public JdbcVisitDao(DataSource dataSource){
        this.dataSource = dataSource;
    }

    public List<Visit> getVisits() {
        //JDBCTemplate Permet de faire la requete
        JdbcTemplate select = new JdbcTemplate(dataSource);
        return select.query("SELECT id, date, description, petId FROM visit", new VisitRowMapper());
    }

    public List<Visit> getVisitsByPetId(int petId) {
        //JDBCTemplate Permet de faire la requete
        JdbcTemplate select = new JdbcTemplate(dataSource);
        return select.query("SELECT * FROM visit WHERE petId=?",new Object[] {petId}, new VisitRowMapper());      
    }

    public List<Visit> getVisitById(int id) {
        JdbcTemplate select = new JdbcTemplate(dataSource);
        return select.query("SELECT * FROM visit WHERE id=?",new Object[] {id},
         new VisitRowMapper());      
    }

    public List<Visit> getVisitsBySearch(String search) {
        JdbcTemplate select = new JdbcTemplate(dataSource);
        return select.query("SELECT * FROM visit WHERE date=? OR description=?",new Object[] {search,search},
         new VisitRowMapper());      
    }

	public int addVisit(String date, String description, int petId) {
        JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);

        return jdbcTemplate.update("INSERT INTO visit (date, description,petId) VALUES(?,?,?)",
        date,description,petId);
	}

    public int deleteVisit(int id) {
        JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);

        return jdbcTemplate.update("DELETE FROM visit WHERE id=?",id);
    }
    
    public int updateVisit(int id, String date, String description, int petId) {
        JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);

        return jdbcTemplate.update("UPDATE visit SET date=?, description=?, petId=? WHERE id=?", date, description,petId, id);
	}

}

