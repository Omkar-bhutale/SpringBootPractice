package com.omkar.comp;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource(value = { "com/omkar/commans/input.properties" })
@ConfigurationProperties(prefix = "my.company2")
public class Company2 {
	private String name;
	private String location;
	private Integer companySize;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		System.out.println("Company2.setName()");
		this.name = name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		System.out.println("Company2.setLocation()");
		this.location = location;
	}
	public Integer getCompanySize() {
		return companySize;
	}
	public void setCompanySize(Integer companySize) {
		System.out.println("Company2.setCompanySize()");
		this.companySize = companySize;
	}
	@Override
	public String toString() {
		return "Company2 [name=" + name + ", location=" + location + ", companySize=" + companySize + "]";
	}
	
	

}
