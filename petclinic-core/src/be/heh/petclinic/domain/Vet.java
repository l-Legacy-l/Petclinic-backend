package be.heh.petclinic.domain;

public class Vet {

    private String lastname;
    private String firstname;
    private String speciality;
    private int id;

    public Vet(int id, String lastname, String firstname,String speciality)
    {
        this.lastname = lastname;
        this.firstname=firstname;
        this.speciality = speciality;
        this.id=id;
    }

    public void setLastname(String lastname){
        this.lastname = lastname;
    }

    public void setFirstname(String firstname){
        this.firstname = firstname;
    }

    public void setSpeciality(String speciality){
        this.speciality = speciality;
    }

    public String getLastname(){
        return this.lastname;
    }

    public String getFirstname(){
        return this.firstname;
    }

    public String getSpeciality(){
        return this.speciality;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


}