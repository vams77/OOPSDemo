
class ConstructorDemo {
	int id;
	
	
	ConstructorDemo()   //default constructor
	{
		System.out.println("In Constructor");
		id=10;
	}

	void display()
	{
		System.out.println(id);
	}
	public static void main(String[] args) 
	{
      
		ConstructorDemo obj=new ConstructorDemo();  // define objects and invoke constructor automatically.
		ConstructorDemo obj1=new ConstructorDemo(); 
obj1.display();
	}

}
