package be.heh.petclinic.web;

import java.util.Collection;

import be.heh.petclinic.component.owner.OwnerComponent;
import be.heh.petclinic.domain.Owner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;

import be.heh.petclinic.component.vet.VetComponent;
import be.heh.petclinic.domain.Vet;

import java.util.List;
import java.util.Collection;
import java.util.Map;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@RestController

public class OwnerRestController {

	@Autowired
	private OwnerComponent OwnerComponentImpl;

	//@RequestMapping(value = "", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	@CrossOrigin
	@RequestMapping("api/v1/owners")
	public ResponseEntity<Collection<Owner>> getOwners(){

		Collection<Owner> owners = OwnerComponentImpl.getOwners();
		if(owners.isEmpty()){
			return new ResponseEntity<Collection<Owner>>(HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<Collection<Owner>>(owners,HttpStatus.OK);
	}

	@RequestMapping(value="api/v1/ownerInsert",params = {"firstname","lastname","address","city",
			"telephone","pet"},method = GET)
	@ResponseBody
	public ResponseEntity<Owner> insertPet(@RequestParam Map<String,String> param)
	{
		String firstname = param.get("firstname");
		String lastname = param.get("lastname");
		String address = param.get("address");
		String city = param.get("city");
		String telephone = param.get("telephone");
		String pet = param.get("pet");

		OwnerComponentImpl.addOwner(firstname,lastname,address,city,telephone,pet);
		return new ResponseEntity<Owner>(HttpStatus.CREATED);
	}
}