package com.example.springdatarest;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Alien {

	@Id
	@GeneratedValue
	private int aid;
	@Column(nullable = false)
	private String aname;
	@Column(nullable = false)
	private String alearning;
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public String getAname() {
		return aname;
	}
	public void setAname(String aname) {
		this.aname = aname;
	}
	public String getAlearning() {
		return alearning;
	}
	public void setAlearning(String alearning) {
		this.alearning = alearning;
	}
	@Override
	public String toString() {
		return "Alien [aid=" + aid + ", aname=" + aname + ", alearning=" + alearning + "]";
	}
	
	
}
