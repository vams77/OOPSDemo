package com.valuemomentum.training.concurancy;

public class JoinDemo extends Thread {
	public void run()
	{
		for (int i =1; i<=5; i++)
		{
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(i);
		}
	}

	public static void main(String[] args) {
	
		JoinDemo t1 = new JoinDemo ();
		JoinDemo t2 = new JoinDemo ();
		JoinDemo t3 = new JoinDemo ();

		
		t1.start();
		
		 try {
			t1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		  
		  t2.start();
		  try {
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
	//waits for current thread to die !!
		
		
		t3.start();
	}

}
