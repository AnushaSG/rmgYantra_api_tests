package com.rmgyantra.pojos;

public class Employee {

	private String empId;
	private String empName;
	private String mobileNo;
	private String email;
	private String dob;
	private double experience;
	private String username;
	private String designation;
	private String role;
	private String project;
	private String msg;
	private String password;
	
	private String employeeName;

	public Employee() {
	}

	public String getEmpId() {
		return empId;
	}

	public void setEmpId(String empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}
	

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public double getExperience() {
		return experience;
	}

	public void setExperience(double experience) {
		this.experience = experience;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getProject() {
		return project;
	}

	public void setProject(String project) {
		this.project = project;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Employee(String empName, String mobileNo, String email, String dob, double experience, String username,
			String designation, String role, String project) {
		super();
		this.empName = empName;
		this.mobileNo = mobileNo;
		this.email = email;
		this.dob = dob;
		this.experience = experience;
		this.username = username;
		this.designation = designation;
		this.role = role;
		this.project = project;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", mobileNo=" + mobileNo + ", email=" + email
				+ ", dob=" + dob + ", experience=" + experience + ", username=" + username + ", designation="
				+ designation + ", password=" + password + ", role=" + role + ", project=" + project + "]";
	}

}
