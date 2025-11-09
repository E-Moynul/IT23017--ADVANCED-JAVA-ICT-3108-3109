//it23017

import java.io.* ;
import java.util.* ;

class Main 
{
    public static void main(String [] args)
    {
        HashMap<Integer, String> employeeDepartments = new HashMap<Integer, String>();
        
        employeeDepartments.put(1001, "Engineering");
        employeeDepartments.put(1002, "Marketing");
        employeeDepartments.put(1003, "Finance");
        employeeDepartments.put(1004, "Engineering");
        
        System.out.println(employeeDepartments);
    }
}
