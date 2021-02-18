class Bank{
	int getRateOfInterest() {return 0;}
	
}
// creating child classes .
class SBI extends Bank
{
	int getRateOfInterest() {return 8;}
}

class ICICI extends Bank 
{
	int getRateOfInterest() {return 7;}

}
class AXIS extends Bank
{
	int getRateOfInterest() {return 9;}
}


public class OverrideDemo {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SBI s=new SBI ();
		ICICI i =new ICICI();
		AXIS a =new AXIS();
		System.out.println(" SBI RAte of interest" + s.getRateOfInterest());
		System.out.println(" ICICI RAte of interest" + i.getRateOfInterest());
		System.out.println(" AXIS RAte of interest" + a.getRateOfInterest());

	}

}
