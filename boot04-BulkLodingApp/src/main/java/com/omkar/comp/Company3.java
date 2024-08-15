package com.omkar.comp;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource(value = { "com/omkar/commans/input.properties" })
@ConfigurationProperties(prefix = "my.company3")
public class Company3 {
	@Value(value = "${my.company2.name}")
	private String name;
	@Value(value = "${my.company2.location}")
	private String location;
	@Value(value = "${my.company2.companySize}")
	private Integer companySize;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		System.out.println("B Company3.setName() ::"+this.name);
		this.name = name;
		System.out.println("A Company3.setName() ::"+this.name);

	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		System.out.println("B Company3.setLocation()  :: "+this.location );
		this.location = location;
		System.out.println("A Company3.setLocation()  :: "+this.location );

	}
	public Integer getCompanySize() {
		return companySize;
	}
	public void setCompanySize(Integer companySize) {
		System.out.println("B Company3.setCompanySize() :: "+this.companySize);
		this.companySize = companySize;
		System.out.println("A Company3.setCompanySize() :: "+this.companySize);

	}
	@Override
	public String toString() {
		return "Company3 [name=" + name + ", location=" + location + ", companySize=" + companySize + "]";
	}
	
	

}
