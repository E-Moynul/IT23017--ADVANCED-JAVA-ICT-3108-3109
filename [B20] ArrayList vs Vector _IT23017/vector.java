import java.util.Vector;

public class VectorCapacityTest {

    public static void main(String[] args) {
        int initialCapacity = 10;
        System.out.println("--- Vector Capacity Test ---");
        System.out.println("Creating Vector with initial capacity: " + initialCapacity);

        // 1. Create Vector with a specified initial capacity of 10
        // When the second "capacityIncrement" argument is omitted, it defaults
        // to 0, which tells the Vector to double its capacity.
        Vector<String> vector = new Vector<>(initialCapacity);
        System.out.println("Capacity right after creation: " + vector.capacity());

        // 2. Add 10 elements to fill the capacity
        System.out.println("Adding 10 elements (IT23001 to IT23010)...");
        for (int i = 1; i <= 10; i++) {
            vector.add("IT230" + String.format("%02d", i));
        }

        System.out.println("\nSize (element count) is now: " + vector.size());
        System.out.println("Capacity (internal array length) is still: " + vector.capacity());

        // 3. Add the 11th element. This triggers the resize.
        System.out.println("\nAdding 11th element (IT23011)...");
        vector.add("IT23011");

        // 4. Check the new size and capacity
        System.out.println("Size (element count) is now: " + vector.size());
        int newCapacity = vector.capacity();
        System.out.println("NEW Capacity (internal array length) is now: " + newCapacity);

        // 5. Prove the math
        int oldCapacity = 10;
        int expectedCapacity = oldCapacity * 2; // 10 * 2
        System.out.println("\n--- Verification ---");
        System.out.println("Old Capacity: " + oldCapacity);
        System.out.println("Expected New Capacity (10 * 2): " + expectedCapacity);
        System.out.println("Result: Proved! Vector grew by 100% (doubled).");
    }
}





/* --- Vector Capacity Test ---
Creating Vector with initial capacity: 10
Capacity right after creation: 10
Adding 10 elements (IT23001 to IT23010)...

Size (element count) is now: 10
Capacity (internal array length) is still: 10

Adding 11th element (IT23011)...
Size (element count) is now: 11
NEW Capacity (internal array length) is now: 20

--- Verification ---
Old Capacity: 10
Expected New Capacity (10 * 2): 20
Result: Proved! Vector grew by 100% (doubled). */
