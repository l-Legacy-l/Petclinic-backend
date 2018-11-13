package be.heh.petclinic.domain;

public class Owner {

    private String lastname;
    private String firstname;
    private String address;
    private String city;
    private String telephone;
    private String pet;

    public Owner(String lastname, String firstname, String address, String city, String telephone, String pet) {
        this.lastname = lastname;
        this.firstname = firstname;
        this.address = address;
        this.city = city;
        this.telephone = telephone;
        this.pet = pet;
    }

    public void setLastname(String lastname){
        this.lastname = lastname;
    }

    public void setFirstname(String firstname){
        this.firstname = firstname;
    }

    public void setAddress(String address){
        this.address = address;
    }

    public void setCity(String city){
        this.city = city;
    }

    public void setTelephone(String telephone){
        this.telephone = telephone;
    }

    public void setPet(String pet){
        this.pet = pet;
    }

    public String getLastname(){
        return this.lastname;
    }

    public String getFirstname(){
        return this.firstname;
    }

    public String getAddress(String address){
        return this.address;
    }

    public String getCity(String city){
        return this.city;
    }

    public String getTelephone(String telephone){
        return this.telephone;
    }

    public String getPet(String pet){
        return this.pet;
    }

}