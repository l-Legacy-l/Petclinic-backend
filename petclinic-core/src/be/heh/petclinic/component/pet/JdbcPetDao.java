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

    public List<Pet> getPets() {
        //JDBCTemplate Permet de faire la requete
        JdbcTemplate select = new JdbcTemplate(dataSource);
        return select.query("SELECT id,type, name, birthdate,ownerId FROM pet",
                new PetRowMapper());
    } 

    public List<Pet> getPetsBySearch(String search) {
        //JDBCTemplate Permet de faire la requete
        JdbcTemplate select = new JdbcTemplate(dataSource);
        return select.query("SELECT id, type, name, birthdate, ownerId FROM pet WHERE type=? OR name=? OR birthdate=? ", 
            new Object[] {search, search, search},new PetRowMapper());
    }

    public List<Pet> getPetById(int id)
    {
        JdbcTemplate select = new JdbcTemplate(dataSource);
        return select.query("SELECT id, type, name, birthdate, ownerId FROM pet WHERE id=?", new Object[] {id}, new PetRowMapper());
    }

    public List<Pet> getPetsByOwnerId(int ownerId)
    {
        JdbcTemplate select = new JdbcTemplate(dataSource);
        return select.query("SELECT id, type, name, birthdate, ownerId FROM pet WHERE ownerId=?", new Object[] {ownerId}, new PetRowMapper());
    }

    public int addPetById(String type, String name,String birthdate,int ownerId)
    {
        JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
        
        return jdbcTemplate.update("INSERT INTO pet (type, name,birthdate,ownerId) VALUES(?,?,?,?)",
                type,name,birthdate,ownerId);
    }

    public int updatePet(int id, String type, String name, String birthdate, int ownerId)
    {
        JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);

        return jdbcTemplate.update("UPDATE pet SET type=?, name=?, birthdate=?, ownerId=? WHERE id=?",
        type,name,birthdate,ownerId,id);
    }

    public int deletePet(int id)
    {
        JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);

        return jdbcTemplate.update("DELETE FROM pet WHERE id=?",id);
    }
}