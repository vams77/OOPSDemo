package com.valuemomentum.training.concurancy;

public class MyThread extends Thread{

	 

    public static void main(String[] args) {
        // TODO Auto-generated method stub
MyThread obj =new MyThread();
obj.create();
System.out.println("This is the main thread");      
    }

 

    private void create() {
        // TODO Auto-generated method stub
        Thread obj1=new Thread(this);
        obj1.start();
    }
        public void run()
        {
            while (true)
            {
                try
                {
                    System.out.println("This is the child thread");
                    Thread.sleep(5);
                    
                }
                catch(InterruptedException e)
                {
                    
                }
            }
        }
    }