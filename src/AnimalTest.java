class Animal
{
	String name;
	public void eat()
	{
		System.out.println("I can eat");
	}
}
class Dog extends Animal
{
	public void display ()
	{
		System.out.println(" my name is " +name);
	}
}
public class AnimalTest {

	public static void main(String[] args) {
		Dog obj = new Dog ();
		obj.name = "asdf";
	
		obj.display();
		obj.eat();
		
		
		
		

	}

}
