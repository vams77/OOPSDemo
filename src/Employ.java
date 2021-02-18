public class Employ {
	  
	    String ename;  
	    int eyear;
	    
	    String eaddress;
	    
	    Employ (String n, int y, String addr){  
	    ename = n;
	    eyear=y;
	   
	    eaddress=addr;
	    
	    
	     
	    }  
	    void display()
	    {
	
	    		 
	    	System.out.println(ename+ "\t"+ eyear+ "\t" +eaddress);
	    	 
	    }
	    
	   
	    public static void main(String args[]){  
	    	 System.out.println("Name\tYear-of-joining \t Address ");
	    Employ e1=  new Employ("Robert" , 1994 , "   \t 64-CWallsStreet");
	    Employ e2= new Employ("Sam" ,     2000 , "    \t 68D- WallsStreet" );
	    Employ e3= new Employ("John" ,   1999, "    \t 26B- WallsStreet  ");
	    
	    e1.display();  
	    e2.display();  
	    e3.display(); 
	   }  
	}  

