package com.valuemomentum.training.concurancy;


class Test extends Thread
{
	public void run()
	{
		System.out.println("Thread " +Thread.currentThread().getId()+ "is running");
		
	}
}
public class MultiThreadDemo {

	public static void main(String[] args) {
		
		int n=8;   // number of threads
		for (int i=1;i<=n;i++)
		{
			Test t = new Test();
			t.start();
		}

	}

}
