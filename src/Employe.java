public class Employe {
int id;
String name;
Address address; //aggregation
public Employe(int id,String name,Address address)
{
    this.id=id;
    this.name=name;
    this.address=address;
   
}
void display()
{
    System.out.println(id+" "+name);
    System.out.println(address.city+" "+address.state+" "+address.country);
   
}
public static void main(String[] args)
{
    Address address1=new Address("Banglore","Karnataka"," India");
    Address address2=new Address("Mumbai","Maharastra"," India");
    Employe e1=new Employe(111,"Varun",address1);
    Employe e2=new Employe(112,"Singh",address2);
    e1.display();
    e2.display();
}
}