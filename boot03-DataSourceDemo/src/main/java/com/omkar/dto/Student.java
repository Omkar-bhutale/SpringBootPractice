package com.omkar.dto;

import java.io.Serializable;

public class Student implements Serializable {

	private static final long serialVersionUID = -1401302034182030100L;
	private Integer sid;
	private String sname;
	private Integer sage;
	private String saddress;
	private Integer smarks;
	public Integer getSid() {
		return sid;
	}
	public void setSid(Integer sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public Integer getSage() {
		return sage;
	}
	public void setSage(Integer sage) {
		this.sage = sage;
	}
	public String getSaddress() {
		return saddress;
	}
	public void setSaddress(String saddress) {
		this.saddress = saddress;
	}
	public Integer getSmarks() {
		return smarks;
	}
	public void setSmarks(Integer smarks) {
		this.smarks = smarks;
	}
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", sage=" + sage + ", saddress=" + saddress + ", smarks="
				+ smarks + "]";
	}
	
	
	
}
