package be.heh.petclinic.web;

import java.util.Collection;

import be.heh.petclinic.component.pet.PetComponent;
import be.heh.petclinic.domain.Pet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.http.ResponseEntity;

import be.heh.petclinic.component.vet.VetComponent;
import be.heh.petclinic.domain.Vet;

import java.util.List;
import java.util.Collection;
import java.util.Map;

@RestController

public class PetRestController {
	public String sort;

	@Autowired
	private PetComponent PetComponentImpl;
    
	//@RequestMapping(value = "", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	@CrossOrigin
	@RequestMapping(value = "api/v1/pets", method = RequestMethod.GET)
	public ResponseEntity<Collection<Pet>> getPets(){
	
		Collection<Pet> pets = PetComponentImpl.getPets();
		if(pets.isEmpty()){
			return new ResponseEntity<Collection<Pet>>(HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<Collection<Pet>>(pets,HttpStatus.OK);
	}

	@RequestMapping(value = "api/v1/pets/tri",params = {"type"}, method = RequestMethod.GET)
	@ResponseBody
		public ResponseEntity<Collection<Pet>> getPetsType(@RequestParam Map<String,String>param)
		{
			sort = param.get("type");
			Collection<Pet> pets = PetComponentImpl.getPetsType(sort);
			if(pets.isEmpty()){
				return new ResponseEntity<Collection<Pet>>(HttpStatus.NOT_FOUND);
			}
			return new ResponseEntity<Collection<Pet>>(pets,HttpStatus.OK);
		}

	
}