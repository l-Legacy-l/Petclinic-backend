package be.heh.petclinic.component.owner;

import be.heh.petclinic.domain.Owner;

import java.util.Collection;

public interface OwnerComponent{

    Collection<Owner> getOwners();
    void addOwner(String firstname,String lastname, String address,String city,String telephone);
    Collection<Owner> getOwnersName(String prenom,String nom);
    /*Collection<Owner> getOwnerById(String id);*/

}