package ma.emsi.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import ma.emsi.entity.Discipline;


public interface DisciplineRepository extends MongoRepository<Discipline,String>{
	List<Discipline> findByIdLike(String id);

	Discipline findById(long id);

}
