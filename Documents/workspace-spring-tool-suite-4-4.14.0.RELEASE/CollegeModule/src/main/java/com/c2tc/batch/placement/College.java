package com.c2tc.batch.placement;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class College {
	private Integer id;
	private String collegeadmin;
	private String Collegename;
	private String location;
	
	//CREATE A CONSTRUCTOR OF ALL THE FIELDS
	public College(Integer id, String collegeadmin, String collegename, String location) {
	
		this.id = id;
		this.collegeadmin = collegeadmin;
		Collegename = collegename;
		this.location = location;
	}
	//CREATE A EMPTY CONSTRUCTOR
	
	public College() {
		super();
	}
	
	//CREATE GETTERS AND SETTERS
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getCollegeadmin() {
		return collegeadmin;
	}
	public void setCollegeadmin(String collegeadmin) {
		this.collegeadmin = collegeadmin;
	}
	public String getCollegename() {
		return Collegename;
	}
	public void setCollegename(String collegename) {
		Collegename = collegename;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}

	
	//CREATE TOSTRING METHOD
	
	@Override
	public String toString() {
		return "College [id=" + id + ", collegeadmin=" + collegeadmin + ", Collegename=" + Collegename + ", location="
				+ location + "]";
	}
}
