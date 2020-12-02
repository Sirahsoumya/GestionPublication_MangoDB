package ma.emsi.repository;

import java.util.List;
import org.springframework.data.mongodb.repository.MongoRepository;
import ma.emsi.entity.Auteur;

public interface AuteurRepository extends  MongoRepository <Auteur, String>{
	List<Auteur> findByIdLike(String id);

	Auteur findById(long id);
//	List<Auteur> findByPublicationTitre(@Param("publicationTitre") String publicationTitre);
    
}
