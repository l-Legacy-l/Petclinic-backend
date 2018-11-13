package be.heh.petclinic.domain;

public class Pet{

    private String type;
    private Owner owner;
    private DateTime birthdate;

    public Pet (String type, Owner owner, DateTime birthDate)
    {
        this.type = type;
        this.owner = owner;
        this.birthdate = birthdate;
    }

    public void setType(String type)
    {
        this.type = type;
    }

    public void setOwner(Owner owner)
    {
        this.owner = owner;
    }

    public void setDateTime(DateTime birthdate)
    {
        this.birthdate=birthdate;
    }

}