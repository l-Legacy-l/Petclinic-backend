package be.heh.petclinic.web;

import java.util.Collection;

import be.heh.petclinic.component.visit.VisitComponent;
import be.heh.petclinic.domain.Visit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.*;
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

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@RestController

public class VisitRestController {
    
	@Autowired
	private VisitComponent VisitRestController;

	//@RequestMapping(value = "", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	@CrossOrigin
	@RequestMapping("api/v1/visits")
	public ResponseEntity<Collection<Visit>> getVisits(){

		Collection<Visit> Visits = VisitRestController.getVisits();
		if(Visits.isEmpty()){
			return new ResponseEntity<Collection<Visit>>(HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<Collection<Visit>>(Visits,HttpStatus.OK);
	}

	@CrossOrigin
	@RequestMapping(value="api/v1/visitInsert",params = {"date","description","petId"},method = GET)
	@ResponseBody
	public ResponseEntity<Visit> insertVisit(@RequestParam Map<String,String> param)
	{
		String date = param.get("date");
		String description = param.get("description");
		int petId = Integer.parseInt(param.get("petId"));

		VisitRestController.addVisit(date,description,petId);
		return new ResponseEntity<Visit>(HttpStatus.CREATED);
    }
         
}