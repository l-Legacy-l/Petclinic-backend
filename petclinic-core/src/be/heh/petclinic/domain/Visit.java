package be.heh.petclinic.domain;

public class Visit {

    private String date;
    private String description;
    private int petId;
    private int id;
    private int vetId;

    public Visit(int id, String date, String description,int petId, int vetId)
    {
        this.id = id;
        this.description=description;
        this.petId = petId;
        this.date = date;
        this.vetId = vetId;
    }

    public void setDate(String date){
        this.date = date;
    }

    public void setDescription(String description){
        this.description = description;
    }

    
    public void setId(int id) {
        this.id = id;
    }

    public void setPetId(int petId) {
        this.petId = petId;
    }
 
    public String getDate(){
        return this.date;
    }

    public String getDescription(){
        return this.description;
    }

    public int getId(){

        return this.id;
    }

    public int getPetId() {
        return this.petId;
    }

    public int getVetId() {
        return vetId;
    }

    public void setVetId(int vetId) {
        this.vetId = vetId;
    }

}