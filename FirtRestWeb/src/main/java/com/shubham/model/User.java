package com.shubham.model;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class User {
	
	@Id
	private long id;
	
	@OneToMany(mappedBy="user")
	@JsonIgnore
	private List<Drugs> drugs;
	
	
	public List<Drugs> getDrugs() {
		return drugs;
	}
	public void setDrugs(List<Drugs> drugs) {
		this.drugs = drugs;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	
	
	protected User() {
		
	}
	public User(long id) {
		super();
		this.id = id;
		
	}
	@Override
	public String toString() {
		return "User [id=" + id + "]";
	}
	
}
