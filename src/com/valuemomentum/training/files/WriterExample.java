package com.valuemomentum.training.files;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

 

public class WriterExample {

 

    public static void main(String[] args) {
        try
        {
            Writer w=new FileWriter("c:/demo/data.txt");
            String content= " she sells sea shells on the sea shore";
            w.write(content);
            w.close();
            System.out.println("data written");
        }
        catch(IOException e)
        {
            e.printStackTrace();
                    
        }

 
    }
}
    

 


