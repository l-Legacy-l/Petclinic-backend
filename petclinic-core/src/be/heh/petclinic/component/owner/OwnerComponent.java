package be.heh.petclinic.component.owner;

import be.heh.petclinic.domain.Owner;

import java.util.Collection;

public interface OwnerComponent{

    Collection<Owner> getOwners();
    Collection<Owner> getOwnersName(String prenom,String nom);

}