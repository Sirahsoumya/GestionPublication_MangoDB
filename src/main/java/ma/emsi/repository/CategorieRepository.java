package ma.emsi.repository;

import java.util.List;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import ma.emsi.entity.Categorie;
@Repository
public interface CategorieRepository extends MongoRepository<Categorie,String> {

	List<Categorie> findByIdLike(String id);

	Categorie findById(long id);
	

}
