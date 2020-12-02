package ma.emsi.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import ma.emsi.entity.Publication;
import ma.emsi.repository.PublicationRepository;

@RestController

public class PublicationController {

	@Autowired
	private PublicationRepository PublicationRepository;

// <----------liste du publications------------->
	@GetMapping("/getPublications")
	public List<Publication> getPublications() {
		return (List<Publication>) PublicationRepository.findAll();
	}

// <----------l'ajout d'une publications------------->
	@PostMapping("/addPublication")
	void addPublication(@RequestBody Publication publication) {
		PublicationRepository.save(publication);
	}

// <----------la liste des publications par Categorie------------->
	@GetMapping("/PublicationCategorie/{type}")
	public List<Publication> PublicationByCategorie(@PathVariable String type) {
		return PublicationRepository.findByCateorie(type);
	}

// <----------la liste des publications par Discipline------------->
	@GetMapping("/PublicationDiscipline/{type}")
	public List<Publication> PublicationByDiscipline(@PathVariable String type) {
		return PublicationRepository.findByDiscipline(type);
	}

	// <----------la liste des publications par Organisme------------->
	@GetMapping("/PublicationOrganisme/{libelle}")
	public List<Publication> PublicationByOrganisme(@PathVariable String libelle) {
		return PublicationRepository.findByOrganisme(libelle);
	}

//<----------List des publication d'un auteur par id------------->
	@GetMapping("/PublicationsAuteurI/{id}")
	public List<Publication> PublicationByAuteurId(@PathVariable String id) {
		return PublicationRepository.findAuteursIdPublication(id);
	}

//<----------List des publication d'un auteur par nom------------->
	@GetMapping("/PublicationsAuteurN/{nom}")
	public List<Publication> PublicationByAuteurName(@PathVariable String nom) {
		return PublicationRepository.findAuteursNamePublication(nom);
	}

//<----------le nombre du publication d'un auteur------------->
	@GetMapping("/countPublication/{nom}")
	public Long PubliAuteur(@PathVariable String nom) {
		return PublicationRepository.countDocumentsPublication(nom);
	}

//<----------le tri croissant des publication par date d'un auteur------------->	
	@GetMapping("/PublicationAut/{nom}")
	public List<Publication> Publication(@PathVariable String nom) {
		return PublicationRepository.TriPublicationsAuteur(nom, Sort.by(Sort.Direction.ASC, "id"));

	}

//<----------Recherche multicritére------------->
	// trouver une publication d'aun auteur precis et une categoris precise

	@GetMapping("/publicationspec/{nom}/{type}")
	public List<Publication> PublicationAuteurCategorieee(@PathVariable String nom, @PathVariable String type) {

		return PublicationRepository.findPublicationByAuteurAndCategorie(nom, type);

	}

// <----------Recherche multicritére------------->
	// trouver une publication version numerique d'aun auteur precis

	@GetMapping("/publication/{nom}/{versionNumerique}")
	public List<Publication> PublicationByAuteurAndVersionNum(@PathVariable String nom,
			@PathVariable String versionNumerique) {

		return PublicationRepository.findPublicationByAuteurAndVersionNum(nom, versionNumerique);

	}

}