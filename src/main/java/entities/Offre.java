package entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity

public class Offre {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String entreprise;
	private String techno;
	private String status;





	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEntreprise() {
		return entreprise;
	}

	public void setEntreprise(String entreprise) {
		this.entreprise = entreprise;
	}

	public String getTechno() {
		return techno;
	}

	public void setTechno(String techno) {
		this.techno = techno;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}