package ma.emsi.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RestController;

import ma.emsi.entity.Auteur;

import ma.emsi.repository.AuteurRepository;

@RestController 
public class AuteurController {
	
	@Autowired
	private AuteurRepository AuteurRepository; 
	@GetMapping("/auteurController")
    public List<Auteur> geAuteurss() {
        return (List<Auteur>) AuteurRepository.findAll();
    }
	@PostMapping("/addAuteur")
    void addUser(@RequestBody Auteur auteur) {
        AuteurRepository.save(auteur);
    }
	@DeleteMapping("/deleteAuteur/{id}")
    public void DeleteAuteur(@PathVariable(required=true) String id)
    {
    	Auteur u=AuteurRepository.findById(Integer.parseInt(id));
    	AuteurRepository.delete(u);
    	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	 /*@GetMapping("/auteurController")  
	 public String showSignUpForm(Model model) {
		 model.addAttribute("auteurs", AuteurRepository.findAll());   return "auteurList";
		 }  
	 @GetMapping("/addAuteur") 
	 public String addForm(Auteur auteur) {   return "add-auteur";  }
	
	 @PostMapping("/addauteur") 
	 public String addAuteur(Auteur auteur, Model model) { 
		 AuteurRepository.save(auteur); 
		 model.addAttribute("auteurs", AuteurRepository.findAll());   return "auteurList";  }  
	 @GetMapping("/edit/{id}")  
	public String showUpdateForm(@PathVariable("id") String id, Model model) { 
		 Auteur auteur = AuteurRepository.findById(id). get(); 
	 model.addAttribute("auteur", auteur);   return "update-auteur";  }
	 @PostMapping("/update/{id}") 
	 public String updateAuteur(@PathVariable("id") String id, Auteur auteur, Model model) {  
		 AuteurRepository.save(auteur); 
		 model.addAttribute("auteurs", AuteurRepository.findAll());   return "auteurList";  }  
	/* @GetMapping("/delete/{id}")  
	 public String deleteAuteur(@PathVariable("id") String id, Model model) {
		 Auteur auteur = AuteurRepository.findById(id). get();  
	 AuteurRepository.delete(auteur); 
	 model.addAttribute("auteurs", AuteurRepository.findAll());   return "auteurList";  } 
	 @RequestMapping(path = "/findByPublicationTitre", method = RequestMethod.GET)
	   public List<Auteur> findByPublicationTitre(
	        
	         @RequestParam("publicationTitre") String publicationTitre) {
	    
	      return AuteurRepository.findByPublicationTitre(publicationTitre);
	      }*/
	    
	   }
	


