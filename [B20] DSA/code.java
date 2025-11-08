//it23017
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Set;
import java.util.TreeMap;
import java.util.ArrayDeque;

public class CollectionDifferences {

    public static void main(String[] args) {

        System.out.println("--- 1. LinkedList ---");
        System.out.println("Use: Good for List + Queue, or frequent insertion/removal with an Iterator.");
        LinkedList<String> nameList = new LinkedList<>();
        nameList.add("Alice");
        nameList.add("Bob");
        nameList.addFirst("Charlie"); 
        nameList.add(2, "David"); 
        System.out.println("LinkedList (maintains insertion order + modifications): " + nameList);

        System.out.println("\n--- 2. Deque (using ArrayDeque) ---");
        System.out.println("Use: A fast, double-ended queue. Use as a Stack (LIFO) or Queue (FIFO).");
        Deque<String> stack = new ArrayDeque<>();
        stack.push("Task 1");
        stack.push("Task 2");
        stack.push("Task 3");
        System.out.println("Deque as Stack (pop): " + stack.pop()); 
        System.out.println("Deque as Stack (pop): " + stack.pop()); 

        Deque<String> queue = new ArrayDeque<>();
        queue.offer("Customer 1");
        queue.offer("Customer 2");
        queue.offer("Customer 3");
        System.out.println("Deque as Queue (poll): " + queue.poll()); 
        System.out.println("Deque as Queue (poll): " + queue.poll()); 

        System.out.println("\n--- 3. PriorityQueue ---");
        System.out.println("Use: When you need to process items by priority, not insertion order.");
        PriorityQueue<Integer> taskPriorities = new PriorityQueue<>();
        taskPriorities.add(30);
        taskPriorities.add(10);
        taskPriorities.add(20);
        System.out.println("PriorityQueue (removing items by natural order - smallest first):");
        while (!taskPriorities.isEmpty()) {
            System.out.println("Polling: " + taskPriorities.poll()); 
        }

        System.out.println("\n--- 4. HashMap ---");
        System.out.println("Use: Fastest key-value storage. Order is NOT guaranteed.");
        Map<String, Integer> userScores = new HashMap<>();
        userScores.put("Chris", 88);
        userScores.put("Alex", 95);
        userScores.put("Zoe", 70);
        System.out.println("HashMap (order not guaranteed):");
        for (Map.Entry<String, Integer> entry : userScores.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        System.out.println("Fast lookup for 'Alex': " + userScores.get("Alex"));

        System.out.println("\n--- 5. TreeMap ---");
        System.out.println("Use: Key-value storage. Keys are automatically SORTED.");
        Map<String, Integer> sortedUserScores = new TreeMap<>();
        sortedUserScores.put("Chris", 88);
        sortedUserScores.put("Alex", 95);
        sortedUserScores.put("Zoe", 70);
        System.out.println("TreeMap (sorted by key):");
        for (Map.Entry<String, Integer> entry : sortedUserScores.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        System.out.println("\n--- 6. HashSet ---");
        System.out.println("Use: Store unique items. Fast 'contains' check. Order NOT guaranteed.");
        Set<String> uniqueTags = new HashSet<>();
        uniqueTags.add("java");
        uniqueTags.add("programming");
        uniqueTags.add("java"); 
        
        System.out.println("HashSet (duplicates ignored, order not guaranteed): " + uniqueTags);
        System.out.println("Does the set contain 'java'? " + uniqueTags.contains("java"));
        System.out.println("Does the set contain 'python'? " + uniqueTags.contains("python"));
    }
}
