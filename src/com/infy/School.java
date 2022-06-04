package com.infy;

public class School {

	private String name;
	private String studentCount;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getStudentCount() {
		return studentCount;
	}
	public void setStudentCount(String studentCount) {
		this.studentCount = studentCount;
	}
	@Override
	public String toString() {
		return "School [name=" + name + ", studentCount=" + studentCount + "]";
	}
	
}
