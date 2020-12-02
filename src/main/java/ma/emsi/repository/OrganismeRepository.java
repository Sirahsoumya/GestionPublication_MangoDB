package ma.emsi.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;


import ma.emsi.entity.Organisme;

public interface OrganismeRepository extends MongoRepository<Organisme,String> {
	List<Organisme> findByIdLike(String id);

	Organisme findById(long id);

}
