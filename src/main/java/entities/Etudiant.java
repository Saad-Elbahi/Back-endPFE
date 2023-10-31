package entities;

import javax.persistence.*;
import java.util.List;

@Entity
public class Etudiant {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String nom;
	private String prenom;
	private String filiere;
	private int groupe;
	private int tele;// Renamed 'group' to 'groupId'
	private String mail;
	@ManyToMany
	@JoinTable(name = "etudiant_offre", joinColumns = @JoinColumn(name = "etudiant_id"), inverseJoinColumns = @JoinColumn(name = "offre_id"))
	private List<Offre> offres;


	public int getId() {
		return id;
	}

	public void setId(int id) {
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

	public String getFiliere() {
		return filiere;
	}

	public void setFiliere(String filiere) {
		this.filiere = filiere;
	}

	public int getGroupe() {
		return groupe;
	}

	public void setGroupe(int groupe) {
		this.groupe = groupe;
	}

	public int getTele() {
		return tele;
	}

	public void setTele(int tele) {
		this.tele = tele;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public List<Offre> getOffres() {
		return offres;
	}

	public void setOffres(List<Offre> offres) {
		this.offres = offres;
	}
}