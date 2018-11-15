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
        return select.query("SELECT id,firstname,lastname,address,city,telephone,pet FROM owner",
                new OwnerRowMapper());
    }

    public int addOwner(String firstname, String lastname,String address,String city,String telephone, String pet)
    {
        JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);

        return jdbcTemplate.update("INSERT INTO owner (firstname, lastname,address,city,telephone,pet) VALUES(?,?,?,?,?,?)",
                firstname,lastname,address,city,telephone,pet);
    }

    
    public List<Owner> getOwnerName(String prenom,String nom) {
        //JDBCTemplate Permet de faire la requete
        JdbcTemplate select = new JdbcTemplate(dataSource);
        return select.query("SELECT id, firstname, lastname, address, city, telephone, pet FROM owner WHERE firstname=? OR lastname=?", 
            new Object[] {prenom, nom},new OwnerRowMapper());
    }
}