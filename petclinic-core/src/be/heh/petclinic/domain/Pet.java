package be.heh.petclinic.domain;

public class Pet{

    private String type;
    private String name;
    private String ownerFirstname;
    private String ownerLastname;
    private String birthdate;

    public Pet (String type, String name, String birthdate, String ownerFirstname, String ownerLastname)
    {
        this.type = type;
        this.name=name;
        this.birthdate = birthdate;
        this.ownerFirstname = ownerFirstname;
        this.ownerLastname=ownerLastname;
    }

    public void setType(String typee)
    {
        this.type = typee;
    }

    public void setOwnerFirstname(String ownerFirstname)
    {
        this.ownerFirstname = ownerFirstname;
    }

    public void setOwnerLastname(String ownerLastname)
    {
        this.ownerLastname = ownerLastname;
    }

    public void setBirthdate(String birthdate)
    {
        this.birthdate=birthdate;
    }

    public String getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    public String getOwnerFirstname() {
        return ownerFirstname;
    }

    public String getOwnerLastname() {
        return ownerLastname;
    }

    public String getBirthdate() {
        return birthdate;
    }



}