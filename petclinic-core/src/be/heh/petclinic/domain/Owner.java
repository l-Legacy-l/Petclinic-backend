package be.heh.petclinic.domain;

public class Owner{

    private String firstname;
    private String lastname;
    private String address;
    private String city;
    private String telephone;
    private int id;

    public Owner (int id,String firstname, String lastname, String address, String city, String telephone)
    {
        this.firstname = firstname;
        this.lastname=lastname;
        this.address = address;
        this.city = city;
        this.telephone=telephone;
        this.id=id;
    }

    public void setFirstname(String firstname)
    {
        this.firstname = firstname;
    }

    public void setLastname(String lastname)
    {
        this.lastname = lastname;
    }

    public void setAddress(String address)
    {
        this.address = address;
    }

    public void setTelephone(String telephone)
    {
        this.telephone=telephone;
    }

    public String getFirstname() {  return firstname;   }

    public String getLastname() {   return lastname;    }

    public String getAddress() {  return address;    }

    public String getCity() {   return city;    }

    public String getTelephone() {  return telephone;    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }




}