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
        return select.query("SELECT id,firstname,lastname,address,city,telephone FROM owner",
                new OwnerRowMapper());
    }

    public int addOwner(String firstname, String lastname,String address,String city,String telephone)
    {
        JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);

        return jdbcTemplate.update("INSERT INTO owner (firstname, lastname,address,city,telephone) VALUES(?,?,?,?,?)",
                firstname,lastname,address,city,telephone);
    }
   
    public List<Owner> getOwnerName(String prenom,String nom) {
        //JDBCTemplate Permet de faire la requete
        JdbcTemplate select = new JdbcTemplate(dataSource);
        return select.query("SELECT id, firstname, lastname, address, city, telephone FROM owner WHERE firstname=? OR lastname=?", 
            new Object[] {prenom, nom},new OwnerRowMapper());
    }

    public List<Owner> getOwnerById(int id) {
        //JDBCTemplate Permet de faire la requete
        JdbcTemplate select = new JdbcTemplate(dataSource);
        
        return select.query("SELECT id, firstname, lastname, address, city, telephone FROM owner WHERE id=?", new Object[] {id},new OwnerRowMapper());
    }

    public int deleteOwner(int id)
    {
        JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);

        return jdbcTemplate.update("DELETE FROM owner WHERE id=?",id);
    }

}