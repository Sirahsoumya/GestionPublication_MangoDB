package ma.emsi.entity;

import java.util.List;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection = "publication")
public class Publication {
	 @Id
	public String id;
    private String titre;
    private String datePublication;
    private String versionNumerique;
    private String resume;
    private String motCle;
    public Discipline discipline;
    public Categorie categorie;
    public List<Auteur> auteur;
    

	public Publication(String id, String titre, String datePublication, String versionNumerique, String resume,
			String motCle, Discipline discipline, Categorie categorie, List<Auteur> auteur) {
		super();
		this.id = id;
		this.titre = titre;
		this.datePublication = datePublication;
		this.versionNumerique = versionNumerique;
		this.resume = resume;
		this.motCle = motCle;
		this.discipline = discipline;
		this.categorie = categorie;
		this.auteur = auteur;
	}



	public Discipline getDiscipline() {
		return discipline;
	}



	public void setDiscipline(Discipline discipline) {
		this.discipline = discipline;
	}



	public Categorie getCategorie() {
		return categorie;
	}



	public void setCategorie(Categorie categorie) {
		this.categorie = categorie;
	}



	public List<Auteur> getAuteur() {
		return auteur;
	}
	
     
     
	public void setAuteur(List<Auteur> auteur) {
		this.auteur = auteur;
	}

	

	public Publication() {
		super();
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}


	public String getTitre() {
        return titre;
    }
    public void setTitre(String titre) {
        this.titre = titre;
    }
    public String getDatePublication() {
        return datePublication;
    }
    public void setDatePublication(String datePublication) {
        this.datePublication = datePublication;
    }
    public String getVersionNumerique() {
        return versionNumerique;
    }
    public void setVersionNumerique(String versionNumerique) {
        this.versionNumerique = versionNumerique;
    }
    public String getResume() {
        return resume;
    }
    public void setResume(String resume) {
        this.resume = resume;
    }
    public String getMotCle() {
        return motCle;
    }
    public void setMotCle(String motCle) {
        this.motCle = motCle;
    }
    
}
