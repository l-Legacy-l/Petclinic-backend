package be.heh.petclinic.component.owner;

import be.heh.petclinic.domain.Owner;

import java.util.Collection;

public interface OwnerComponent{

    Collection<Owner> getOwners();
    void addOwner(String firstname,String lastname, String address,String city,String telephone);
    Collection<Owner> getOwnerById(int id);
    Collection<Owner> getOwnersBySearch(String search);
    void deleteOwner(int id);

}