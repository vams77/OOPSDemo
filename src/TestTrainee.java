import java.util.Scanner;

class Trainee
{
	int tId;
	String tName;
	String Technology;
	float Salary, Stipend;
	
	
	
	void input()
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("enter Id,Name,Technology and Salary of a trainee");
		tId=sc.nextInt();
		tName=sc.next();
		Technology=sc.next();
		Salary=sc.nextFloat();
	}
	
	float calculate() 
	{
		Stipend = (Salary-200);
		return Stipend;
		
	}
	
	
	
	
	
	
	void display()

	{
		System.out.println("       Trainee Details     ");
		System.out.println("Trainee Id :"+tId);
		System.out.println("Trainee Name : "+tName);
		System.out.println("Technology : "+Technology);
		// System.out.println("Stipend : "+Salary);
	}
	
	
	
}



public class TestTrainee {

	public static void main(String[] args) {
		Trainee t1=new Trainee();
		Trainee t2=new Trainee();
		t1.input();
	
		t2.input();
		float s1=t1.calculate();
		float s2=t2.calculate();
		
		t1.display();
		System.out.println(" Stipend    : "+s1);
		
		t2.display();
		System.out.println(" Stipend    : "+s2);
		

	}

}
