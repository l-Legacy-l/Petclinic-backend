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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.http.ResponseEntity;

import be.heh.petclinic.component.vet.VetComponent;
import be.heh.petclinic.domain.Vet;

import java.util.List;
import java.util.Map;
import java.util.Collection;
import static org.springframework.web.bind.annotation.RequestMethod.GET;


@RestController

public class VetRestController {

	public String spec;

	@Autowired
	private VetComponent vetComponentImpl;
    
	//@RequestMapping(value = "", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	@CrossOrigin
	@RequestMapping("api/v1/vets")
	public ResponseEntity<Collection<Vet>> getVets(){
	
		Collection<Vet> vets = vetComponentImpl.getVets();
		if(vets.isEmpty()){
			return new ResponseEntity<Collection<Vet>>(HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<Collection<Vet>>(vets,HttpStatus.OK);
	}

	@CrossOrigin
	@RequestMapping(value = "api/v1/vets",params = {"speciality"}, method = RequestMethod.GET)
	@ResponseBody
		public ResponseEntity<Collection<Vet>> getVetsSpeciality(@RequestParam Map<String,String>param)
		{
			spec = param.get("speciality");

			Collection<Vet> vets = vetComponentImpl.getVetsSpeciality(spec);
			if(vets.isEmpty()){
				return new ResponseEntity<Collection<Vet>>(HttpStatus.NOT_FOUND);
			}
			return new ResponseEntity<Collection<Vet>>(vets,HttpStatus.OK);
		}

	@CrossOrigin
	@RequestMapping(value="api/v1/vetInsert",params = {"lastname","firstname","speciality"},method = GET)
	@ResponseBody
	public ResponseEntity<Vet> insertVet(@RequestParam Map<String,String> param)
	{
		String lastname = param.get("lastname");
		String firstname = param.get("firstname");
		String speciality = param.get("speciality");

		vetComponentImpl.addVet(lastname,firstname,speciality);
		
		return new ResponseEntity<Vet>(HttpStatus.CREATED);
	}

	@CrossOrigin
	@RequestMapping(value="api/v1/vetDelete",params = {"id"},method = GET)
	@ResponseBody
	public ResponseEntity<Vet> deleteVet(@RequestParam Map<String,String> param)
	{
		int id = Integer.parseInt(param.get("id"));

		vetComponentImpl.deleteVet(id);
		
		return new ResponseEntity<Vet>(HttpStatus.CREATED);
	}
}