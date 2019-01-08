package be.heh.petclinic.domain;

public class Pet{

    private String type;
    private String name;
    private String birthdate;
    private int id;
    private int ownerId;

    public Pet (int id, String type, String name, String birthdate,int ownerId)
    {
        this.type = type;
        this.name=name;
        this.birthdate = birthdate;
        this.ownerId=ownerId;
        this.id = id;
    }

    public void setType(String type)
    {
        this.type = type;
    }

    public void setOwnerId(int ownerId)
    {
        this.ownerId = ownerId;
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

    public int getOwnerId() {
        return ownerId;
    }

    public String getBirthdate() {
        return birthdate;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

}