package entities;

import javax.persistence.*;
import java.util.Date;

@Entity

public class Pfe {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int ref;
	private String entreprise;
	private String sujet;
	@ManyToOne
	@JoinColumn(name = "encadrant_id")
	private Encadrant encadrant;
	@OneToOne
	@JoinColumn(name = "etudiant_id")
	private Etudiant etudiant;
	private Date date_debut;
	private Date date_fin;


	public int getRef() {
		return ref;
	}

	public void setRef(int ref) {
		this.ref = ref;
	}

	public String getEntreprise() {
		return entreprise;
	}

	public void setEntreprise(String entreprise) {
		this.entreprise = entreprise;
	}

	public String getSujet() {
		return sujet;
	}

	public void setSujet(String sujet) {
		this.sujet = sujet;
	}

	public Encadrant getEncadrant() {
		return encadrant;
	}

	public void setEncadrant(Encadrant encadrant) {
		this.encadrant = encadrant;
	}

	public Etudiant getEtudiant() {
		return etudiant;
	}

	public void setEtudiant(Etudiant etudiant) {
		this.etudiant = etudiant;
	}

	public Date getDate_debut() {
		return date_debut;
	}

	public void setDate_debut(Date date_debut) {
		this.date_debut = date_debut;
	}

	public Date getDate_fin() {
		return date_fin;
	}

	public void setDate_fin(Date date_fin) {
		this.date_fin = date_fin;
	}

}