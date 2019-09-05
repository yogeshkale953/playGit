package com;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Test {
	public static void main(String[] args) {
		Student s = new Student(1, "yog");
		
		Student s1 = new Student(1,"yog");
		System.out.println(s.hashCode()+"Hashcode"+s1.hashCode());
		Map<Student, String> m = new HashMap<Student, String>();
		m.put(s, "IIT");
		m.put(s1, "CT");

		/*
		 * for (Student s2 : m.keySet()) { System.out.println(m.get(s2)); }
		 */	
		
	Set<Student> key=m.keySet();
	
	Iterator<Student> itr=key.iterator();
	
	while (itr.hasNext()) {
		Student stu = (Student) itr.next();
		System.out.println("And Value is"+m.get(stu));
		
	}

	
	}

}
