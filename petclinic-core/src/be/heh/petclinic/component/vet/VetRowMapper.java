package be.heh.petclinic.component.vet;

import org.springframework.jdbc.core.RowMapper;
import java.sql.SQLException;
import java.sql.ResultSet;

import be.heh.petclinic.domain.Vet;

public class VetRowMapper implements RowMapper<Vet> {

    //Classe qui permet de faire la correspondance avec le ResultSet (ce qu'on récupère de la BDD, le jeu de donnée)
    //l'objet vétérinaire

    //int i = le numéro de la rangée

    @Override
    public Vet mapRow(ResultSet rs,int i) throws SQLException {
         //on fait le mapping
        Vet vet = new Vet(rs.getString("lastname"),rs.getString("firstname"),rs.getString("speciality"));
        return vet;
    }


}