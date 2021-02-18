package com.valuemomentum.training.files;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializedDemo {

	public static void main(String[] args) {
	
		Employee e = new Employee();
		e.name = "Mcheal ";

		e.address= " castle street";
		e.SSN = 112213123;
		e.number = 101;
		
		try
		{
			FileOutputStream fileOut = new FileOutputStream ( "C:/demo/f.txt");
			ObjectOutputStream out = new ObjectOutputStream(fileOut);
			out.writeObject(e);
			out.close();
			fileOut.close();
			System.out.println("Serialized data is saved in C:/demo/f.txt");
		}
		catch (IOException i)
		{
			i.printStackTrace();
		}
		
	}

}
