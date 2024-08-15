package com.omkar.modal;




public class Student {
	private Integer sId;
	private String sName;
	private String sAddress;
	public Integer getsId() {
		System.out.println("Student.getsId()");
		return sId;
	}
	public void setsId(Integer sId) {
		
		this.sId = sId;
	}

	public String getsName() {
		System.out.println("Student.getsName()");
		return sName;
	}
	public void setsName(String sName) {
		this.sName = sName;
	}
	public String getsAddress() {
		System.out.println("Student.getsAddress()");
		return sAddress;
	}
	public void setsAddress(String sAddress) {
		this.sAddress = sAddress;
	}

	
}
