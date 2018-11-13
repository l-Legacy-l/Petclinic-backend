package be.heh.petclinic.component.owner;

import org.springframework.jdbc.core.JdbcTemplate;


import be.heh.petclinic.domain.Owner;
import java.util.List;

import javax.sql.DataSource;

public class JdbcOwnerDao {
    //Classe pour se connecter à la BDD et récupérer les données

    private DataSource dataSource;

    public JdbcOwnerDao(DataSource dataSource){
        this.dataSource = dataSource;
    }

    public List<Owner> getEvents() {
        //JDBCTemplate Permet de faire la requete
        JdbcTemplate select = new JdbcTemplate(dataSource);
        return select.query("SELECT * FROM owner", new OwnerRowMapper());
    }

}

