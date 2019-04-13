package com.example.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.example.entities.audit.UserDateAudit;

@Entity





public class RHdemandeRecrutement extends UserDateAudit{
	

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private Date dateDemande;
	private Date dateSouhaite;
	private String demandeur;
	private String fonctionDemandee;
	private int nbrPersone;
	private String profilDemande;
	private String mission; 
	private String competence ;
	private String motif ; 
	private String nomGerant ; 
	private String nomRespRH ; 
public RHdemandeRecrutement() {
	super();
		// TODO Auto-generated constructor stub
	}
public RHdemandeRecrutement(Date dateDemande, Date dateSouhaite, String demandeur, String fonctionDemandee,
		int nbrPersone, String profilDemande, String mission, String competence, String motif, String nomGerant,
		String nomRespRH) {
	super();
	this.dateDemande = dateDemande;
	this.dateSouhaite = dateSouhaite;
	this.demandeur = demandeur;
	this.fonctionDemandee = fonctionDemandee;
	this.nbrPersone = nbrPersone;
	this.profilDemande = profilDemande;
	this.mission = mission;
	this.competence = competence;
	this.motif = motif;
	this.nomGerant = nomGerant;
	this.nomRespRH = nomRespRH;
}
public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}
public Date getDateDemande() {
	return dateDemande;
}
public void setDateDemande(Date dateDemande) {
	this.dateDemande = dateDemande;
}
public Date getDateSouhaite() {
	return dateSouhaite;
}
public void setDateSouhaite(Date dateSouhaite) {
	this.dateSouhaite = dateSouhaite;
}
public String getDemandeur() {
	return demandeur;
}
public void setDemandeur(String demandeur) {
	this.demandeur = demandeur;
}
public String getFonctionDemandee() {
	return fonctionDemandee;
}
public void setFonctionDemandee(String fonctionDemandee) {
	this.fonctionDemandee = fonctionDemandee;
}
public int getNbrPersone() {
	return nbrPersone;
}
public void setNbrPersone(int nbrPersone) {
	this.nbrPersone = nbrPersone;
}
public String getProfilDemande() {
	return profilDemande;
}
public void setProfilDemande(String profilDemande) {
	this.profilDemande = profilDemande;
}
public String getMission() {
	return mission;
}
public void setMission(String mission) {
	this.mission = mission;
}
public String getCompetence() {
	return competence;
}
public void setCompetence(String competence) {
	this.competence = competence;
}
public String getMotif() {
	return motif;
}
public void setMotif(String motif) {
	this.motif = motif;
}
public String getNomGerant() {
	return nomGerant;
}
public void setNomGerant(String nomGerant) {
	this.nomGerant = nomGerant;
}
public String getNomRespRH() {
	return nomRespRH;
}
public void setNomRespRH(String nomRespRH) {
	this.nomRespRH = nomRespRH;
}


	
	

}
