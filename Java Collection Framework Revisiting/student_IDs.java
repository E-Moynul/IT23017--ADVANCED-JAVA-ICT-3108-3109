//it23017

import java.util.* ;

class Main 
{
    public static void main(String [] args)
    {
        TreeMap<String, String> studentDetails = new TreeMap<String, String>();
        
        studentDetails.put("S102", "Alice");
        studentDetails.put("S100", "Bob");
        studentDetails.put("S101", "Charlie");
        studentDetails.put("S099", "David");
        
        System.out.println(studentDetails);
    }
}
