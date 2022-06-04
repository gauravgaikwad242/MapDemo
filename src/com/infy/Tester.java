package com.infy;

import java.util.List;

public class Tester {

	public static void main(String[] args) {
	
		Student rahul = new Student();
		rahul.setName("rahul");
		rahul.setAge("15");
	
		System.out.println("age of student is "
				+ rahul.getAge()
				+"and name is " +rahul.getName());
		
		School primary = new School();
		primary.setName("bharat vidyalaya");
		primary.setStudentCount("800");
		System.out.println(primary);
	
	}
	
}
