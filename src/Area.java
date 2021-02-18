import java.util.Scanner;

public class Area {
	
	int area;

	
	Area(int l , int b)
	{
		
		area= l*b;
		
		
		
	}
	void display()
	{
		System.out.println("Area of rectangle is "+area);
	}

	public static void main(String[] args) {
     int length;
     int breath;
      
		Scanner sc=new Scanner(System.in);
		System.out.println("enter length");
		length=sc.nextInt();
		System.out.println("enter breadth");
		breath=sc.nextInt();
		
		Area a1=new  Area (length,breath);
		a1.display();
		
		

	}

}
