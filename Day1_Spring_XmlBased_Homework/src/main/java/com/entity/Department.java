package com.entity;

public class Department {

	int deptId;
	String deptName;
	String location;
	int totalEmployee;
	String managerName;

	public Department() {

	}

	public Department(int deptId, String deptName, String location, int totalEmployee, String managerName) {
		super();
		this.deptId = deptId;
		this.deptName = deptName;
		this.location = location;
		this.totalEmployee = totalEmployee;
		this.managerName = managerName;
	}

	public int getDeptId() {
		return deptId;
	}

	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public int getTotalEmployee() {
		return totalEmployee;
	}

	public void setTotalEmployee(int totalEmployee) {
		this.totalEmployee = totalEmployee;
	}

	public String getManagerName() {
		return managerName;
	}

	public void setManagerName(String managerName) {
		this.managerName = managerName;
	}

	@Override
	public String toString() {
		return "Department [deptId=" + deptId + ", deptName=" + deptName + ", location=" + location + ", totalEmployee="
				+ totalEmployee + ", managerName=" + managerName + "]";
	}

}