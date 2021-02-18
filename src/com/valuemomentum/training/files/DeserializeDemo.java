package com.valuemomentum.training.files;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializeDemo {

	public static void main(String[] args) {
		
		Employee e = null;
		try
		{
			FileInputStream fileIn= new FileInputStream("C:/demo/f.txt");
			ObjectInputStream in = new ObjectInputStream(fileIn);
			e = (Employee) in.readObject();
			in.close();
			fileIn.close();
		}
		catch(IOException i)
		{
			i.printStackTrace();
			return;
		}
		catch (ClassNotFoundException c)
		{
			System.out.println("Employee class not found");
			c.printStackTrace();
			return;
		}
		System.out.println("Deserialized Employee ...");
		System.out.println("NAme : " + e.name);
		System.out.println("ssn : " + e.SSN);
		System.out.println("number : " + e.number);
		}

	}


