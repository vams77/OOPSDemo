package com.valuemomentum.training.files;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;


public class ReaderExample {

public static void main(String[] args) {
// TODO Auto-generated method stub


try
{
Reader r = new FileReader("C:/demo/f.txt");
int data = r.read();
while(data != -1)
{
System.out.print((char)data);
data=r.read();
 

}
r.close();
 
}
catch(IOException e)
{
e.printStackTrace();
}

}
}