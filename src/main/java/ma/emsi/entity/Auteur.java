package ma.emsi.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Auteur")
	public class Auteur {
	    @Id
	    private String id;
	    private String nom;
	    private String prenom;
	    private String dateNaissance;
	    private String adresse;
	    private String grade;
	    public Organisme organisme;
	    /* @JsonIgnore
	    public List<Publication> publication;*/
	    public Auteur() {
	    	
	    }
	    
	   
		public Organisme getOrganisme() {
			return organisme;
		}


		public void setOrganisme(Organisme organisme) {
			this.organisme = organisme;
		}


		public String getId() {
	        return id;
	    }
	    public void setId(String id) {
	        this.id = id;
	    }
	    public String getNom() {
	        return nom;
	    }
	    public void setNom(String nom) {
	        this.nom = nom;
	    }
	    public String getPrenom() {
	        return prenom;
	    }
	    public void setPrenom(String prenom) {
	        this.prenom = prenom;
	    }
	    public String getDateNaissance() {
	        return dateNaissance;
	    }
	    public void setDateNaissance(String dateNaissance) {
	        this.dateNaissance = dateNaissance;
	    }
	    public String getAdresse() {
	        return adresse;
	    }
	    public void setAdresse(String adresse) {
	        this.adresse = adresse;
	    }
	    public String getGrade() {
	        return grade;
	    }
	    public void setGrade(String grade) {
	        this.grade = grade;
	    }
	   
	    
	}
	    
