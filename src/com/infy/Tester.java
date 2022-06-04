package com.infy;

import java.nio.channels.NetworkChannel;
import java.util.List;

public class Tester {

	public static void main(String[] args) {
	
		School bv= new School();
		bv.setName("bharat vidyalaya");
		Student one = new Student();
		one.setName("gaurav gaikwad");
		one.setAge(13);
		Student two = new Student();
		two.setName("rahul");
		two.setAge(13);
		List<Student> students= List.of(one,two);
		bv.setStudent(students);
		System.out.println(bv);
	
	}
	
}
