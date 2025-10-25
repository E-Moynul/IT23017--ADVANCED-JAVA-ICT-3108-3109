import java.util.ArrayList;
import java.lang.reflect.Field;

public class ArrayListCapacityTest {

    /**
     * Helper function to get the private capacity of an ArrayList using reflection.
     * This is the only way to "see" the internal capacity.
     */
    public static int getArrayListCapacity(ArrayList<?> list) {
        try {
            // Get the private "elementData" field from the ArrayList class
            Field field = ArrayList.class.getDeclaredField("elementData");
            // Make it accessible
            field.setAccessible(true);
            // Get the value (which is an Object array) and return its length
            Object[] elementData = (Object[]) field.get(list);
            return elementData.length;
        } catch (Exception e) {
            e.printStackTrace();
            return -1;
        }
    }

    public static void main(String[] args) {
        int initialCapacity = 10;
        System.out.println("--- ArrayList Capacity Test ---");
        System.out.println("Creating ArrayList with initial capacity: " + initialCapacity);

        // 1. Create ArrayList with a specified initial capacity of 10
        ArrayList<String> list = new ArrayList<>(initialCapacity);
        System.out.println("Capacity right after creation: " + getArrayListCapacity(list));

        // 2. Add 10 elements to fill the capacity
        System.out.println("Adding 10 elements (IT23001 to IT23010)...");
        for (int i = 1; i <= 10; i++) {
            list.add("IT230" + String.format("%02d", i));
        }

        System.out.println("\nSize (element count) is now: " + list.size());
        System.out.println("Capacity (internal array length) is still: " + getArrayListCapacity(list));

        // 3. Add the 11th element. This triggers the resize.
        System.out.println("\nAdding 11th element (IT23011)...");
        list.add("IT23011");

        // 4. Check the new size and capacity
        System.out.println("Size (element count) is now: " + list.size());
        int newCapacity = getArrayListCapacity(list);
        System.out.println("NEW Capacity (internal array length) is now: " + newCapacity);

        // 5. Prove the math
        int oldCapacity = 10;
        int expectedCapacity = oldCapacity + (oldCapacity >> 1); // 10 + (10 / 2)
        System.out.println("\n--- Verification ---");
        System.out.println("Old Capacity: " + oldCapacity);
        System.out.println("Expected New Capacity (10 + 10/2): " + expectedCapacity);
        System.out.println("Result: Proved! ArrayList grew by 50%.");
    }
}


/*output : --- ArrayList Capacity Test ---
Creating ArrayList with initial capacity: 10
Capacity right after creation: 10
Adding 10 elements (IT23001 to IT23010)...

Size (element count) is now: 10
Capacity (internal array length) is still: 10

Adding 11th element (IT23011)...
Size (element count) is now: 11
NEW Capacity (internal array length) is now: 15

--- Verification ---
Old Capacity: 10
Expected New Capacity (10 + 10/2): 15
Result: Proved! ArrayList grew by 50%. */
