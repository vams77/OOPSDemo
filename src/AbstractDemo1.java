abstract  class Shape1 
{
String ObjectName = " ";
Shape1()         //a default constructor should be invoked always //super constructor
{ 
    
} 
Shape1(String name)
{
    this.ObjectName= name;
}

 

public void moveTo(int x,int y)
{
    System.out.println(this.ObjectName+" "+"has been moved to " + "x= " +x+  " and y= " +y);
}
abstract public double area();
abstract public void draw();
}
class Rectangles extends Shape1
{
    int length;
    int width;
    
    Rectangles(int length,int width,String name)
    
    {
        this.length=length;
        this.width=width;
    }
    public void draw()
    {
        System.out.println("Rectangle has been drawn");
    }
    public double area()
    {
        return (double)(length*width);
    }
}
class Circles extends Shape1
{
    double pi=3.14;
    int radius;
Circles(int radius,String name)
{
    super(name);
    this.radius=radius;
}
public void draw()
{
    System.out.println("circles has been drawn");
}
public double area()
{
    return(double)((pi*radius*radius)/2);

 

}
    
}
class Shapes
{
    public static void main(String[] args)
    {
        Shape1 obj=new Rectangles(2,3,"Rectangle");
        System.out.println("Area of rectangle:"+obj.area());
        obj.moveTo(1, 2);
        System.out.println(" ");
        Shape1 obj2=new Circles(2,"Circle");
        System.out.println("Area is:"+obj2.area());
        obj2.moveTo(2,4);

 

    }
    
}