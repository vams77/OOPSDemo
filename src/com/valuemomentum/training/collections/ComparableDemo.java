package com.valuemomentum.training.collections;

import java.util.*;
public class ComparableDemo {

 

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        ArrayList<Student> a1=new ArrayList<Student>();
        a1.add(new Student(100,"John",29));
        a1.add(new Student(101,"Mike",21));
        a1.add(new Student(102,"JMary",25));
        
Collections.sort(a1);
for(Student  st:a1)
{
    System.out.println(st.rollNo +" "+st.name+" "+st.age);
}
    }

 

}