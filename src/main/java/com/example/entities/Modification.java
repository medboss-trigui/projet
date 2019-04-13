package com.example.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.example.entities.audit.UserDateAudit;

@Entity
public class Modification extends UserDateAudit {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private int page;

	private String chapitre;

	private String descModif;

	private Date dateModif;

	private String observation;

	public Modification() {
		super();
	}

	public Modification(int page, String chapitre, String descModif, Date dateModif, String observation) {
		super();
		this.page = page;
		this.chapitre = chapitre;
		this.descModif = descModif;
		this.dateModif = dateModif;
		this.observation = observation;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int getPage() {
		return page;
	}

	public void setPage(int page) {
		this.page = page;
	}

	public String getChapitre() {
		return chapitre;
	}

	public void setChapitre(String chapitre) {
		this.chapitre = chapitre;
	}

	public String getDescModif() {
		return descModif;
	}

	public void setDescModif(String descModif) {
		this.descModif = descModif;
	}

	public Date getDateModif() {
		return dateModif;
	}

	public void setDateModif(Date dateModif) {
		this.dateModif = dateModif;
	}

	public String getObservation() {
		return observation;
	}

	public void setObservation(String observation) {
		this.observation = observation;
	}

}
