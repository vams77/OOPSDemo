import java.util.HashSet;
import java.util.Set;

public class HashSetUserDefined {

 

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Set<Employee3> empset=new HashSet<Employee3>();
        
        Employee3 e1=new Employee3(100,"John",5000);
        Employee3 e2=new Employee3(101,"Mike",6000);
        Employee3 e3=new Employee3(102,"Raj",7000);
        Employee3 e4=new Employee3(103,"john",5000);
        
        empset.add(e1);
        empset.add(e2);
        empset.add(e3);
        empset.add(e4);
        
        for(Employee3 e:empset)
        {
            System.out.println(e.id+" "+e.name+" "+e.sal);
        }
        
    }

 

}