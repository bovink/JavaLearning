package org.bovink.javalearning.main;

import org.bovink.javalearning.person.Person;

public class InterfaceTest {

	public static void main(String args[]) {
		System.out.print("Hello World\n");
		Employee e = new Employee("he") {
			
		};
		Person p = new Person();
		Object o;
		Person[] persons = new Person[3];
		o = persons;
		o = new int[4];
		Student s = new Student();
		Integer i = s.increaseNum(3);
		System.out.println(i);
		
		
		
		// 你好
		// this is from mac
		if (p instanceof Student) {
			System.out.print("p �� Student");
		}
		
		
		if (s instanceof Person) {
			System.out.print("s �� Person");
		}
	}
}
