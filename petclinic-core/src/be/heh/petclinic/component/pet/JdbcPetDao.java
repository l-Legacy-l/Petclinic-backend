package be.heh.petclinic.component.pet;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;

import be.heh.petclinic.domain.Pet;
import java.util.List;

import javax.sql.DataSource;

public class JdbcPetDao {
    //Classe pour se connecter à la BDD et récupérer les données

    private DataSource dataSource;
    public String types;

    public JdbcPetDao(DataSource dataSource){
        this.dataSource = dataSource;
    }

    public List<Pet> getEvents() {
        //JDBCTemplate Permet de faire la requete
        JdbcTemplate select = new JdbcTemplate(dataSource);
        return select.query("SELECT id,type, name, birthdate, ownerFirstname,ownerLastname FROM pet",
                new PetRowMapper());
    } 

    public List<Pet> getPetType(String sort) {
        //JDBCTemplate Permet de faire la requete
        JdbcTemplate select = new JdbcTemplate(dataSource);
        return select.query("SELECT id, type, name, birthdate, ownerFirstname,ownerLastname FROM pet WHERE type=?", 
            new Object[] {sort},new PetRowMapper());
    }


    public int addPet(String type, String name,String birthdate,String ownerFirstname,String ownerLastname)
    {
        JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);

        return jdbcTemplate.update("INSERT INTO pet (type, name,birthdate,ownerFirstname,ownerLastname) VALUES(?,?,?,?,?)",
                type,name,birthdate,ownerFirstname,ownerLastname);
    }




}