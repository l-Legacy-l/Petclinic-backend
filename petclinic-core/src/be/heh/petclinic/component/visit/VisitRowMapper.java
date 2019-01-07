package be.heh.petclinic.component.visit;

import org.springframework.jdbc.core.RowMapper;
import java.sql.SQLException;
import java.sql.ResultSet;

import be.heh.petclinic.domain.Visit;

public class VisitRowMapper implements RowMapper<Visit> {

    //Classe qui permet de faire la correspondance avec le ResultSet (ce qu'on récupère de la BDD, le jeu de donnée)
    //l'objet vétérinaire

    //int i = le numéro de la rangée

    @Override
    public Visit mapRow(ResultSet rs,int i) throws SQLException {
         //on fait le mapping
        Visit visit = new Visit(rs.getInt("id"),rs.getString("date"),rs.getString("description"),rs.getInt("petId"), rs.getInt("vetId"));
        return visit;
    }


}