package be.heh.petclinic.component.pet;

import org.springframework.jdbc.core.RowMapper;
import java.sql.SQLException;
import java.sql.ResultSet;

import be.heh.petclinic.domain.Pet;

public class PetRowMapper implements RowMapper<Pet> {

    //Classe qui permet de faire la correspondance avec le ResultSet (ce qu'on récupère de la BDD, le jeu de donnée)
    //l'objet vétérinaire

    //int i = le numéro de la rangée

    @Override
    public Pet mapRow(ResultSet rs,int i) throws SQLException {
         //on fait le mapping
        Pet pet = new Pet(rs.getInt("id"),rs.getString("type"),rs.getString("name"),
                rs.getString("birthdate"),rs.getString("ownerFirstname"),
                rs.getString("ownerLastname"));
        return pet;
    }


}