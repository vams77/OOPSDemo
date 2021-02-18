import java.util.Scanner;

class truck 
{
	int axles ;
	float weight;
	String name;
	float time;
	float tolldue;
	float reciepts;
	
	
	void input()
	{
		Scanner sc= new Scanner (System.in);
		name=sc.next();
		time=sc.nextFloat();
		axles=sc.nextInt();
		weight = sc.nextFloat();
	
		
		
	}
	
	float calculate()
	{
		tolldue=(weight*axles)/100;
		return tolldue;
		
		
		
		
	}
	
	void display()

	{
		System.out.println("       Truck details     ");
		System.out.println("Truck name :"+name);
		System.out.println("Trainee Name : "+weight);
		System.out.println("Technology : "+axles);
		System.out.println("toldd due is : " +tolldue);
	
	
	
}
	
	



public static class testtruck {

	public static void main ( String[] args) {
{
	

		
		truck t1=new truck();
		truck t2=new truck();
		t1.input();
		t2.input();
		float s1=t1.calculate();
		float s2=t2.calculate();
		
		t1.display();
		System.out.println(" toll due     : "+s1);
		
		t2.display();
		System.out.println(" toll due   : "+s2);

		

	}
	}
}
}

