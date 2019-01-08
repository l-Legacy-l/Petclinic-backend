package be.heh.petclinic.component.vet;

import org.springframework.jdbc.core.JdbcTemplate;


import be.heh.petclinic.domain.Vet;
import java.util.List;

import javax.sql.DataSource;

public class JdbcVetDao {
    //Classe pour se connecter à la BDD et récupérer les données

    private DataSource dataSource;

    public JdbcVetDao(DataSource dataSource){
        this.dataSource = dataSource;
    }

    public List<Vet> getEvents() {
        //JDBCTemplate Permet de faire la requete
        JdbcTemplate select = new JdbcTemplate(dataSource);
        return select.query("SELECT id, lastname, firstname, speciality FROM vet", new VetRowMapper());
    }

    public List<Vet> getVetSpeciality(String spec) {
        //JDBCTemplate Permet de faire la requete
        JdbcTemplate select = new JdbcTemplate(dataSource);
        return select.query("SELECT * FROM vet WHERE speciality=?",new Object[] {spec}, new VetRowMapper());
            
    }

    public List<Vet> getVetById(int id) {
        //JDBCTemplate Permet de faire la requete
        JdbcTemplate select = new JdbcTemplate(dataSource);
        return select.query("SELECT * FROM vet WHERE id=?",new Object[] {id}, new VetRowMapper());         
    }

    public List<Vet> getVetsBySearch(String search) {
        //JDBCTemplate Permet de faire la requete
        JdbcTemplate select = new JdbcTemplate(dataSource);
        return select.query("SELECT * FROM vet WHERE lastname=? OR firstname=? OR speciality=? ", 
            new Object[] {search, search, search},new VetRowMapper());
    }

    public int addVet(String lastname, String firstname, String speciality) 
    {
        JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);

        return jdbcTemplate.update("INSERT INTO vet (lastname, firstname, speciality) VALUES(?,?,?)",
        lastname,firstname,speciality);
    }
    
    public int deleteVet(int id) 
    {
        JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);

        return jdbcTemplate.update("DELETE FROM vet WHERE id=?",id);
    }

    public int updateVet(int id, String lastname, String firstname, String speciality)
    {
        JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);

        return jdbcTemplate.update("UPDATE vet SET lastname=?, firstname=?, speciality=? WHERE id=?",
        lastname,firstname,speciality,id);
    }


    
}

