package com.omkar.comp;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@ConfigurationProperties(prefix = "emp.info")
@Component
public class Employee {

	@Value("omkar")
	private String name;

	@Value("22")
	private long id;

	private String[] skills;

	private List<String> teamMembers;
	
	private Set<Long> phoneNumbers;
	
	private Company company;

	private Map<String,Object> idDetails;
	public String getName() {
		System.out.println("Employee.getName()");
		return name;
	}

	public void setName(String name) {
		System.out.println("Employee.setName()");
		this.name = name;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		System.out.println("Employee.setId()");
		this.id = id;
	}

	public String[] getSkills() {
		return skills;
	}

	public void setSkills(String[] skills) {
		System.out.println("Employee.setSkills()");
		this.skills = skills;
	}

	public List<String> getTeamMembers() {
		return teamMembers;
	}

	public void setTeamMembers(List<String> teamMembers) {
		this.teamMembers = teamMembers;
	}
	

	public Set<Long> getPhoneNumbers() {
		return phoneNumbers;
	}

	public void setPhoneNumbers(Set<Long> phoneNumbers) {
		this.phoneNumbers = phoneNumbers;
	}

	public Map<String, Object> getIdDetails() {
		return idDetails;
	}

	public void setIdDetails(Map<String, Object> idDetails) {
		this.idDetails = idDetails;
	}
	

	public Company getCompany() {
		return company;
	}

	public void setCompany(Company company) {
		this.company = company;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + ", skills=" + Arrays.toString(skills) + ", teamMembers="
				+ teamMembers + ", phoneNumbers=" + phoneNumbers + ", company=" + company + ", idDetails=" + idDetails
				+ "]";
	}

}
