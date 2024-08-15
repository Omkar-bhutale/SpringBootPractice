package com.omkar.comp;

import org.springframework.stereotype.Component;

@Component("com")
public class Company {
	private String title;
	private String location;
	private Integer size;
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		System.out.println("Company.setTitle()");
		this.title = title;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		System.out.println("Company.setLocation()");
		this.location = location;
	}
	public Integer getSize() {
		return size;
	}
	public void setSize(Integer size) {
		System.out.println("Company.setSize()");
		this.size = size;
	}
	@Override
	public String toString() {
		return "Company [title=" + title + ", location=" + location + ", size=" + size + "]";
	}
	
	
	

}
