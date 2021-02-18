package com.valuemomentum.training.files;

import java.io.File;
import java.io.IOException;

public class FileClass {

	public static void main(String[] args) {
		 File f = new File (" c:/test/hello.txt");
		 try
		 {
			 
			 if (f.createNewFile())
			 {
				 System.out.println("New File Created!");
			 }
			 else
			 {
				 System.out.println(" the file already exists");
			 }
		 }
		 
			 catch (IOException e)
			 {
				 e.printStackTrace();
			 }
		 

	}
}


	