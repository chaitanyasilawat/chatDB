package com.data.resourse;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.data.model.Aliens;

@RestController
public class AlienResource {

	@Autowired
	AlienReposetry alienrepo;
	
	@GetMapping("alien")
	public List<Aliens> getAliens() {
	
	List<Aliens> alien=(List<Aliens>) alienrepo.findAll();
	
	return alien;
}
@PostMapping("alienp")	
public List<Aliens> persist(@RequestBody final Aliens a){
alienrepo.save(a);
return (List<Aliens>) alienrepo.findAll();

}	

@DeleteMapping("aliend/{id}")
public void deleteAlien(@PathVariable int id) {
alienrepo.deleteById(id);
	
	
}
@PutMapping("alienu")	
public Aliens saveOrupdateAlien(@RequestBody Aliens a) {
alienrepo.save(a);
return a;


}	


}
