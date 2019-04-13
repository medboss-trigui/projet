package com.example.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.example.entities.audit.UserDateAudit;

@Entity
public class RHevaluationEmp extends UserDateAudit {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String nomRespo ;
	private String fonctionRespo ; 
	private String cinRespo ;
	private Date dateRespo ; 
	
	private String cinEmp ; 
	private String nomEmp ; 
	private String prenomEmp ; 
	private String fonctionEmp ; 
	private String observation ; 
	private String evalRespect ; 
	private String evalsavoirFaire ; 
	private String evalAbsence ; 
	private String evalTotal ;
	
	
	
	
	public RHevaluationEmp() {
		super();
		
	}




	public RHevaluationEmp(String nomRespo, String fonctionRespo, String cinRespo, Date dateRespo, String cinEmp,
			String nomEmp, String prenomEmp, String fonctionEmp, String observation, String evalRespect,
			String evalsavoirFaire, String evalAbsence, String evalTotal) {
		super();
		this.nomRespo = nomRespo;
		this.fonctionRespo = fonctionRespo;
		this.cinRespo = cinRespo;
		this.dateRespo = dateRespo;
		this.cinEmp = cinEmp;
		this.nomEmp = nomEmp;
		this.prenomEmp = prenomEmp;
		this.fonctionEmp = fonctionEmp;
		this.observation = observation;
		this.evalRespect = evalRespect;
		this.evalsavoirFaire = evalsavoirFaire;
		this.evalAbsence = evalAbsence;
		this.evalTotal = evalTotal;
	}




	public Long getId() {
		return id;
	}




	public void setId(Long id) {
		this.id = id;
	}




	public String getNomRespo() {
		return nomRespo;
	}




	public void setNomRespo(String nomRespo) {
		this.nomRespo = nomRespo;
	}




	public String getFonctionRespo() {
		return fonctionRespo;
	}




	public void setFonctionRespo(String fonctionRespo) {
		this.fonctionRespo = fonctionRespo;
	}




	public String getCinRespo() {
		return cinRespo;
	}




	public void setCinRespo(String cinRespo) {
		this.cinRespo = cinRespo;
	}




	public Date getDateRespo() {
		return dateRespo;
	}




	public void setDateRespo(Date dateRespo) {
		this.dateRespo = dateRespo;
	}




	public String getCinEmp() {
		return cinEmp;
	}




	public void setCinEmp(String cinEmp) {
		this.cinEmp = cinEmp;
	}




	public String getNomEmp() {
		return nomEmp;
	}




	public void setNomEmp(String nomEmp) {
		this.nomEmp = nomEmp;
	}




	public String getPrenomEmp() {
		return prenomEmp;
	}




	public void setPrenomEmp(String prenomEmp) {
		this.prenomEmp = prenomEmp;
	}




	public String getFonctionEmp() {
		return fonctionEmp;
	}




	public void setFonctionEmp(String fonctionEmp) {
		this.fonctionEmp = fonctionEmp;
	}




	public String getObservation() {
		return observation;
	}




	public void setObservation(String observation) {
		this.observation = observation;
	}




	public String getEvalRespect() {
		return evalRespect;
	}




	public void setEvalRespect(String evalRespect) {
		this.evalRespect = evalRespect;
	}




	public String getEvalsavoirFaire() {
		return evalsavoirFaire;
	}




	public void setEvalsavoirFaire(String evalsavoirFaire) {
		this.evalsavoirFaire = evalsavoirFaire;
	}




	public String getEvalAbsence() {
		return evalAbsence;
	}




	public void setEvalAbsence(String evalAbsence) {
		this.evalAbsence = evalAbsence;
	}




	public String getEvalTotal() {
		return evalTotal;
	}




	public void setEvalTotal(String evalTotal) {
		this.evalTotal = evalTotal;
	}
	
	
	
	
	

}
