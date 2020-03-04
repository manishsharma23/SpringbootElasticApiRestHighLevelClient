package com.elasticapi;

import java.util.List;

public class ProfileDocument {

	private String id;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public List<Technologies> getTechnologies() {
		return technologies;
	}

	public void setTechnologies(List<Technologies> technologies) {
		this.technologies = technologies;
	}

	public Location getLocation() {
		return location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}

	public String getEmails() {
		return emails;
	}

	public void setEmails(String emails) {
		this.emails = emails;
	}

	public String getYearsOfExperience() {
		return yearsOfExperience;
	}

	public void setYearsOfExperience(String yearsOfExperience) {
		this.yearsOfExperience = yearsOfExperience;
	}

	private String firstName;
	private String lastName;
	private List<Technologies> technologies;
	private Location location;
	private String emails;
	private String yearsOfExperience;

}