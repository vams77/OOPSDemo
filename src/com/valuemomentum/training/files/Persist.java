package com.valuemomentum.training.files;

import java.io.*;
public class Persist {

 

    public static void main(String[] args) throws Exception {
        // TODO Auto-generated method stub
Student s1=new Student(101,"vamsi");
FileOutputStream fout=new FileOutputStream("C:/demo/f.txt");
ObjectOutputStream out= new ObjectOutputStream(fout);
out.writeObject(s1);
out.flush();
System.out.println("success");
    }
 

}