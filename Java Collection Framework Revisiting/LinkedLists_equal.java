//it23017

import java.io.* ;
import java.util.* ;

class Main 
{
    public static void main(String [] args)
    {
        LinkedList<String> list1 = new LinkedList<String>();
        list1.add("Apple");
        list1.add("Banana");
        list1.add("Cherry");

        LinkedList<String> list2 = new LinkedList<String>();
        list2.add("Apple");
        list2.add("Banana");
        list2.add("Cherry");
        
        LinkedList<String> list3 = new LinkedList<String>();
        list3.add("Apple");
        list3.add("Banana");
        list3.add("Mango");
        
        LinkedList<String> list4 = new LinkedList<String>();
        list4.add("Apple");
        list4.add("Banana");

        boolean isEqual_1_2 = list1.equals(list2);
        boolean isEqual_1_3 = list1.equals(list3);
        boolean isEqual_1_4 = list1.equals(list4);

        System.out.println("List 1: " + list1);
        System.out.println("List 2: " + list2);
        System.out.println("List 3: " + list3);
        System.out.println("List 4: " + list4);
        
        System.out.println("\nList 1 equals List 2: " + isEqual_1_2);
        System.out.println("List 1 equals List 3: " + isEqual_1_3);
        System.out.println("List 1 equals List 4: " + isEqual_1_4);
    }
}
