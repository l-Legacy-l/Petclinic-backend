package be.heh.petclinic.component.owner;

import org.springframework.jdbc.core.RowMapper;
import java.sql.SQLException;
import java.sql.ResultSet;

import be.heh.petclinic.domain.Owner;

public class OwnerRowMapper implements RowMapper<Owner> {

    //Classe qui permet de faire la correspondance avec le ResultSet (ce qu'on récupère de la BDD, le jeu de donnée)
    //l'objet propriétaire

    //int i = le numéro de la rangée

    @Override
    public Owner mapRow(ResultSet rs,int i) throws SQLException {
         //on fait le mapping
        Owner owner = new Owner(rs.getInt("id"),rs.getString("firstname"),rs.getString("lastname"),
                rs.getString("address"),rs.getString("city"), rs.getString("telephone"));
        return owner;
    }


}