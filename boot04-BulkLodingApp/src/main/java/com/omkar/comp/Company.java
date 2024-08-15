package com.omkar.comp;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource(value = { "application.properties" })
@ConfigurationProperties(prefix = "org.company")
public class Company {
	private String name;
	private String location;
	private Integer size;
	public String getName() {
		System.out.println("Company.getName()");
		return name;
	}
	public void setName(String name) {
		System.out.println("Company.setName()");
		this.name = name;
	}
	public String getLocation() {
		System.out.println("Company.getLocation()");
		return location;
	}
	public void setLocation(String location) {
		System.out.println("Company.setLocation()");
		this.location = location;
	}
	public Integer getSize() {
		System.out.println("Company.getSize()");
		return size;
	}
	public void setSize(Integer size) {
		System.out.println("Company.setSize()");
		this.size = size;
	}
	@Override
	public String toString() {
		return "Company [name=" + name + ", location=" + location + ", size=" + size + "]";
	}
	

}
