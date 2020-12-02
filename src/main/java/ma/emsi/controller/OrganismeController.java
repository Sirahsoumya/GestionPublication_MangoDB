package ma.emsi.controller;

import java.util.List;
import ma.emsi.repository.OrganismeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import ma.emsi.entity.Organisme;


@RestController
public class OrganismeController {  
	@Autowired 
	private OrganismeRepository OrganismeRepository;  
	@GetMapping("/organismeController")
    public List<Organisme> getOrganismes() {
        return (List<Organisme>) OrganismeRepository.findAll();
    }
	@PostMapping("/addOrganisme")
    void addOrganisme(@RequestBody Organisme organisme) {
        OrganismeRepository.save(organisme);
    }
	

}
