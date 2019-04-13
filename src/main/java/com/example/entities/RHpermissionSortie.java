package com.example.entities;

import com.example.entities.audit.UserDateAudit;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity


public class RHpermissionSortie extends UserDateAudit {
	
	
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private Date date ; 
	private String nom;
	private String prenom;
	private String foction;
	private String nbrheur;
	private String cin;
	private String hdebut; 
	private String hfin ;
	private String raisonsortie ; 
	private String tel ;
	private String accordAdmin ;
	public RHpermissionSortie() {
		super();
		// TODO Auto-generated constructor stub
	}
	public RHpermissionSortie(Date date, String nom, String prenom, String foction, String nbrheur, String cin,
			String hdebut, String hfin, String raisonsortie, String tel, String accordAdmin) {
		super();
		this.date = date;
		this.nom = nom;
		this.prenom = prenom;
		this.foction = foction;
		this.nbrheur = nbrheur;
		this.cin = cin;
		this.hdebut = hdebut;
		this.hfin = hfin;
		this.raisonsortie = raisonsortie;
		this.tel = tel;
		this.accordAdmin = accordAdmin;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
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
	public String getFoction() {
		return foction;
	}
	public void setFoction(String foction) {
		this.foction = foction;
	}
	public String getNbrheur() {
		return nbrheur;
	}
	public void setNbrheur(String nbrheur) {
		this.nbrheur = nbrheur;
	}
	public String getCin() {
		return cin;
	}
	public void setCin(String cin) {
		this.cin = cin;
	}
	public String getHdebut() {
		return hdebut;
	}
	public void setHdebut(String hdebut) {
		this.hdebut = hdebut;
	}
	public String getHfin() {
		return hfin;
	}
	public void setHfin(String hfin) {
		this.hfin = hfin;
	}
	public String getRaisonsortie() {
		return raisonsortie;
	}
	public void setRaisonsortie(String raisonsortie) {
		this.raisonsortie = raisonsortie;
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
