package org.bovink.javalearning.main;

import org.bovink.javalearning.person.Person;

public class Student extends Person {

	private void prinAge() {
		System.out.print(age);
	}
	
	private void printOther(Student s) {
		System.out.print(s.age);
	}
	
	private void printPersonAge(Person p) {
		
	}
	
	public Integer increaseNum(Integer i) {
		System.out.print("a");
		return i *3; 
	}
}
