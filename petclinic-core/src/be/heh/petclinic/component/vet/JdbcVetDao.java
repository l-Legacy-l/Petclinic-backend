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
        return select.query("SELECT lastname, firstname, speciality FROM vet", new VetRowMapper());
    }

    public List<Vet> getVetSpeciality(String spec) {
        //JDBCTemplate Permet de faire la requete
        JdbcTemplate select = new JdbcTemplate(dataSource);
        return select.query("SELECT lastname, firstname, speciality FROM vet WHERE speciality=?",new Object[] {spec}, new VetRowMapper());
            
    }


}

