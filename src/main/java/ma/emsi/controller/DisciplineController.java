package ma.emsi.controller;

import java.util.List;
import ma.emsi.repository.DisciplineRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import ma.emsi.entity.Discipline;


@RestController
public class DisciplineController {
	@Autowired 
	private DisciplineRepository DisciplineRepository;  
	@GetMapping("/disciplineController")
    public List<Discipline> getDisciplines() {
        return (List<Discipline>) DisciplineRepository.findAll();
    }
	@PostMapping("/addDiscipline")
    void addDiscipline(@RequestBody Discipline discipline) {
        DisciplineRepository.save(discipline);
    }
	
	
	
	
	
	
}
