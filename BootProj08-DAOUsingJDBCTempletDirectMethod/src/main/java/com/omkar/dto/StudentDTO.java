package com.omkar.dto;

import java.io.Serializable;

public class StudentDTO implements Serializable {
    private static final long serialVersionUID = 1L;

	private int srNo;
    private String sname;
    private String saddr;
    private Integer smarks;
    private Integer sage;

    public int getSrNo() {
        return srNo;
    }

    public void setSrNo(int srNo) {
        this.srNo = srNo;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public String getSaddr() {
        return saddr;
    }

    public void setSaddr(String saddr) {
        this.saddr = saddr;
    }

	public Integer getSmarks() {
		return smarks;
	}

	public void setSmarks(Integer smarks) {
		this.smarks = smarks;
	}

	public Integer getSage() {
		return sage;
	}

	public void setSage(Integer sage) {
		this.sage = sage;
	}

	@Override
	public String toString() {
		return "StudentBO [srNo=" + srNo + ", sname=" + sname + ", saddr=" + saddr + ", smarks=" + smarks + ", sage="
				+ sage + "]";
	}
			
}
