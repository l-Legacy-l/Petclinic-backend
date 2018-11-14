package be.heh.petclinic.web;

import java.util.Collection;

import be.heh.petclinic.component.pet.PetComponent;
import be.heh.petclinic.domain.Pet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;

import be.heh.petclinic.component.vet.VetComponent;
import be.heh.petclinic.domain.Vet;

import java.util.List;
import java.util.Collection;
import java.util.Map;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@RestController

public class PetRestController {

	@Autowired
	private PetComponent PetComponentImpl;
    
	//@RequestMapping(value = "", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	@CrossOrigin
	@RequestMapping("api/v1/pets")
	public ResponseEntity<Collection<Pet>> getPets(){
	
		Collection<Pet> pets = PetComponentImpl.getPets();
		if(pets.isEmpty()){
			return new ResponseEntity<Collection<Pet>>(HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<Collection<Pet>>(pets,HttpStatus.OK);
	}
	@RequestMapping(value="api/v1/petInsert",params = {"type","name","birthdate","ownerFirstname",
			"ownerLastname"},method = GET)
	@ResponseBody
	public ResponseEntity<Pet> insertPet(@RequestParam Map<String,String> param)
	{
		String type = param.get("type");
		String name = param.get("name");
		String ownerFirstname = param.get("ownerFirstname");
		String ownerLastname = param.get("ownerLastname");
		String birthdate = param.get("birthdate");
		System.out.println(birthdate);

		PetComponentImpl.addPet(type,name,birthdate,ownerFirstname,ownerLastname);
		return new ResponseEntity<Pet>(HttpStatus.CREATED);
	}
}