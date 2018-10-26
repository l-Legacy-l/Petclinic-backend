package be.heh.petclinic.component.vet;

import org.springframework.jdbc.core.JdbcTemplate;


import be.heh.petclinic.domain.Vet;
import java.util.List;

import javax.sql.DataSource;

public class JdbcVetDao {

    private DataSource dataSource;

    public JdbcVetDao(DataSource dataSource){
        this.dataSource = dataSource;
    }

    public List<Vet> getEvents() {
        JdbcTemplate select = new JdbcTemplate(dataSource);
        return select.query("SELECT lastname, firstname, speciality FROM vet", new VetRowMapper());
    }

}

