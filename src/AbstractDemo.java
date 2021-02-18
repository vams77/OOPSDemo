abstract class Animal11
{
    abstract void makeSound();
    
public void eat()
{
    System.out.println("Animals can eat.");
    
}

 

}
class Dogs extends Animal11
{    
    //implementation of abstract method
    public void makeSound()
    {
        System.out.println("Bark bark");
    }
}

 


public class AbstractDemo {

 

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Dogs obj=new Dogs();
        obj.makeSound();
        obj.eat();

 

    }
}