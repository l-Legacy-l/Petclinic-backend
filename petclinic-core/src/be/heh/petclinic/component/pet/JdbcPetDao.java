package be.heh.petclinic.component.pet;

import org.springframework.jdbc.core.JdbcTemplate;


import be.heh.petclinic.domain.Pet;
import java.util.List;

import javax.sql.DataSource;

public class JdbcPetDao {
    //Classe pour se connecter à la BDD et récupérer les données

    private DataSource dataSource;

    public JdbcPetDao(DataSource dataSource){
        this.dataSource = dataSource;
    }

    public List<Pet> getEvents() {
        //JDBCTemplate Permet de faire la requete
        JdbcTemplate select = new JdbcTemplate(dataSource);
        return select.query("SELECT type, name, birthdate, ownerFirstname,ownerLastname FROM pet",
                new PetRowMapper());
    }

}