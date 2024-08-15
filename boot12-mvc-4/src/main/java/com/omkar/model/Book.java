package com.omkar.model;

public class Book {
	private String bname;
	private String bauther;
	private Integer bprice;
	public String getBname() {
		return bname;
	}
	public void setBname(String bname) {
		this.bname = bname;
	}
	public String getBauther() {
		return bauther;
	}
	public void setBauther(String bauther) {
		this.bauther = bauther;
	}
	public Integer getBprice() {
		return bprice;
	}
	public void setBprice(Integer bprice) {
		this.bprice = bprice;
	}
	@Override
	public String toString() {
		return "Book [bname=" + bname + ", bauther=" + bauther + ", bprice=" + bprice + "]";
	}
}
