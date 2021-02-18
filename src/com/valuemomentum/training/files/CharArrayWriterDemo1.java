package com.valuemomentum.training.files;

import java.io.CharArrayWriter;
import java.io.FileWriter;

public class CharArrayWriterDemo1 {

		public static void main(String args[])throws Exception{ 
		   
		          CharArrayWriter out=new CharArrayWriter(); 
		   
		          out.write("Welcome to IO Programming in Java");    
		          FileWriter f1=new FileWriter("c:/demo/data.txt");    
		          FileWriter f2=new FileWriter("c:/demo/data.txt");    
		          FileWriter f3=new FileWriter("c:/demo/data.txt");    
		          FileWriter f4=new FileWriter("c:/demo/data.txt");

		    
		          out.writeTo(f1);    
		          out.writeTo(f2);    
		          out.writeTo(f3);    
		          out.writeTo(f4);    

		          f1.close();    
		          f2.close();    
		          f3.close();    
		          f4.close();    
		          System.out.println("Success...");    
		         }    
		        }    
