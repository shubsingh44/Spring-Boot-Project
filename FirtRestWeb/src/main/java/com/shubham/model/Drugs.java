package com.shubham.model;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Drugs {
	
	@Id
	@GeneratedValue
	private long id;
	private String drugname;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JsonIgnore
	private User user;
	
	protected Drugs() {
		
	}
	
	public Drugs(long id, String drugname) {
		super();
		this.id = id;
		this.drugname = drugname;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getDrugname() {
		return drugname;
	}
	public void setDrugname(String drugname) {
		this.drugname = drugname;
	}
	@Override
	public String toString() {
		return "Drugs [drugid=" + id + ", drugname=" + drugname + "]";
	}
	public void setUser(User user2) {
		// TODO Auto-generated method stub
		this.user=user2;
		
	}
	
}
