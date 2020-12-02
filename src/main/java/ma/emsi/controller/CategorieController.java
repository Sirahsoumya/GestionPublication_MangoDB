package ma.emsi.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import ma.emsi.repository.CategorieRepository;
import ma.emsi.entity.Categorie;



@RestController
public class CategorieController {
	@Autowired
	private CategorieRepository CategorieRepository; 
	
	@GetMapping("/categorieController")
    public List<Categorie> getCategories() {
        return (List<Categorie>) CategorieRepository.findAll();
    }
	@PostMapping("/addCategorie")
    void addCategorie(@RequestBody Categorie categorie) {
        CategorieRepository.save(categorie);
    }
	 
}
	

