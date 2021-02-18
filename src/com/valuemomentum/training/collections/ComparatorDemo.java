package com.valuemomentum.training.collections;

import java.util.ArrayList;
import java.util.Collections;

public class ComparatorDemo {

	public static void main(String[] args) {

		ArrayList<Student5> ar = new ArrayList<Student5>();
		
Student5 s1=new Student5(111,"John","Banglore");
Student5 s2=new Student5(131,"John","Bombay");
Student5 s3=new Student5(141,"John","Hyd");
Student5 s4=new Student5(161,"John","Kerala");

ar.add(s1);
ar.add(s2);
ar.add(s3);
ar.add(s4);


System.out.println("Unsorted Array List : ");
for (int i=0;i<ar.size(); i++)
	System.out.println(ar.get(i));

Collections.sort(ar, new SortByRoll());

System.out.println("Unsorted Array List : ");
for (int i=0;i<ar.size(); i++)
	System.out.println(ar.get(i));

	}

}
