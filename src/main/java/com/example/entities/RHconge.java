package com.example.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.example.entities.audit.UserDateAudit;

@Entity
public class RHconge extends UserDateAudit {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	

	private String nom;

	private String prenom;

	

	private String fonction;
	
	private String cin ; 
	
	private int nbrJr ;
	private Date dateDebut ; 
	private Date dateFin ; 
	private String typeConge ;
	private String tel ; 
	private String accordAdmin ; 

	public RHconge() {
		super();
	}

	public RHconge(String nom, String prenom, String fonction, String cin, int nbrJr, Date dateDebut, Date dateFin,
			String typeConge, String tel, String accordAdmin) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.fonction = fonction;
		this.cin = cin;
		this.nbrJr = nbrJr;
		this.dateDebut = dateDebut;
		this.dateFin = dateFin;
		this.typeConge = typeConge;
		this.tel = tel;
		this.accordAdmin = accordAdmin;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
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

	public String getFonction() {
		return fonction;
	}

	public void setFonction(String fonction) {
		this.fonction = fonction;
	}

	public String getCin() {
		return cin;
	}

	public void setCin(String cin) {
		this.cin = cin;
	}

	public int getNbrJr() {
		return nbrJr;
	}

	public void setNbrJr(int nbrJr) {
		this.nbrJr = nbrJr;
	}

	public Date getDateDebut() {
		return dateDebut;
	}

	public void setDateDebut(Date dateDebut) {
		this.dateDebut = dateDebut;
	}

	public Date getDateFin() {
		return dateFin;
	}

	public void setDateFin(Date dateFin) {
		this.dateFin = dateFin;
	}

	public String getTypeConge() {
		return typeConge;
	}

	public void setTypeConge(String typeConge) {
		this.typeConge = typeConge;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getAccordAdmin() {
		return accordAdmin;
	}

	public void setAccordAdmin(String accordAdmin) {
		this.accordAdmin = accordAdmin;
	}
	
}
