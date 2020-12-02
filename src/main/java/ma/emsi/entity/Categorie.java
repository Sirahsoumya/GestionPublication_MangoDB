package ma.emsi.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
@Document(collection = "Categorie")
public class Categorie {
	@Id
	public String id;
	public String type;
	
	

	public Categorie() {
		super();
		
	}

	public Categorie(String id, String type) {
		super();
		this.id = id;
		this.type = type;
	
	}


	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	

}
