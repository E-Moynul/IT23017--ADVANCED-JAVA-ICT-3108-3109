//it23017
import java.io.* ;
import java.util.* ;


class Main 
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in) ;
        
        int n=sc.nextInt() ;
        
        ArrayList<Integer>ar = new ArrayList<Integer>() ;
        
        ar.add(14);
        ar.add(24);
        ar.add(34);
        ar.add(44);
        ar.add(55);
        
        Collections.sort(ar) ;
        
        System.out.println(ar.get(n-1)) ;
    }
}
