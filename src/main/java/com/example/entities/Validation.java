package com.example.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.example.entities.audit.UserDateAudit;

@Entity
public class Validation extends UserDateAudit {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String redacteur;
	
	private String verificateur;
	
	private String approbateur;

	public Validation() {
		super();
	}

	public Validation(String redacteur, String verificateur, String approbateur) {
		super();
		this.redacteur = redacteur;
		this.verificateur = verificateur;
		this.approbateur = approbateur;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getRedacteur() {
		return redacteur;
	}

	public void setRedacteur(String redacteur) {
		this.redacteur = redacteur;
	}

	public String getVerificateur() {
		return verificateur;
	}

	public void setVerificateur(String verificateur) {
		this.verificateur = verificateur;
	}

	public String getApprobateur() {
		return approbateur;
	}

	public void setApprobateur(String approbateur) {
		this.approbateur = approbateur;
	}

}
