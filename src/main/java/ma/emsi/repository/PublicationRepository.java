package ma.emsi.repository;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import ma.emsi.entity.Publication;
@Repository
public interface PublicationRepository extends MongoRepository <Publication,String> {
	List<Publication> findByIdLike(String id);
	

	@Query("{'categorie.type': ?0}")
	List<Publication> findByCateorie(String type);
	
	@Query("{'Discipline.type': ?0}")
	List<Publication> findByDiscipline(String type);

	@Query("{'auteur.organisme.libelle': ?0}")
	List<Publication> findByOrganisme(String libelle);
	
	@Query("{'auteur.id': ?0}")
	List<Publication> findAuteursIdPublication(String id);
	
	@Query("{'auteur.nom': ?0}")
	List<Publication> findAuteursNamePublication(String nom);
	//Compter le nombre de publication par auteur
	@Query(value = "{'auteur.nom': {$regex: ?0, $options: 'i'}}", count = true)
	public Long countDocumentsPublication(String cat);
	
	 @Query("{ 'auteur.nom' : ?0}")
	 List<Publication> TriPublicationsAuteur(String nom, Sort sort);
	
	//  recherche multicritere
	@Query("{'auteur.nom': ?0 , 'versionNumerique': ?1}")
	List<Publication> findPublicationByAuteurAndVersionNum(String nom , String versionNumerique );
	
	@Query("{'auteur.nom': ?0, 'categorie.type': ?1 }")
	List<Publication> findPublicationByAuteurAndCategorie(String nom , String type );
	
	
}
	
