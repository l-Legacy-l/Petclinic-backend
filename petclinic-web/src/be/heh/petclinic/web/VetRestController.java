package be.heh.petclinic.web;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMethod;

import be.heh.petclinic.component.vet.VetComponentImpl;
import be.heh.petclinic.domain.Vet;

import java.util.List;
import java.util.ArrayList;

@RestController

public class VetRestController {

	//@Autowired
	private VetComponentImpl vetComponent = new VetComponentImpl();
    
	//@RequestMapping(value = "", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	@RequestMapping("api/v1/vets")
	public List<Vet> getVets(){
	
		/*if(vets.isEmpty()){
			//return new ResponseEntity<Collection<Vet>>(HttpStatus.NOT_FOUND);
		}*/
		
		return this.vetComponent.getVets();
	}
}