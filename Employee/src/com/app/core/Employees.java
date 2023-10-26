package com.app.core;

import java.time.LocalDate;

public class Employees {

	private String name;
	private static int empId = 0;
	private int empID;
	private LocalDate doj;
	private String phone;
	private String aadharNo;
	private EmpType empType;

	public Employees(EmpType empType, String name, LocalDate doj, String phone, String aadharNo) {
		super();
		++empId;
		this.empType = empType;
		this.name = name;
		this.empID = empId;
		this.doj = doj;
		this.phone = phone;
		this.aadharNo = aadharNo;
	}

	public EmpType getEmpType() {
		return empType;
	}

	public String getName() {
		return name;
	}

	public int getEmpID() {
		return empID;
	}

	public LocalDate getDoj() {
		return doj;
	}

	public String getPhone() {
		return phone;
	}

	public String getAadharNo() {
		return aadharNo;
	}

	@Override
	public String toString() {
		return "Employees [name=" + name + ", empID=" + empID + ", doj=" + doj + ", phone=" + phone + ", aadharNo="
				+ aadharNo + ", empType=" + empType + "]";
	}

}
