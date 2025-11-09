//it23017

import java.io.* ;
import java.util.* ;

class Entry<T> {
    T value;
    long seqNum;

    public Entry(T value, long seqNum) {
        this.value = value;
        this.seqNum = seqNum;
    }

    @Override
    public String toString() {
        return value.toString();
    }
}

class StackComparator<T> implements Comparator<Entry<T>> {
    @Override
    public int compare(Entry<T> o1, Entry<T> o2) {
        return Long.compare(o2.seqNum, o1.seqNum);
    }
}

class QueueComparator<T> implements Comparator<Entry<T>> {
    @Override
    public int compare(Entry<T> o1, Entry<T> o2) {
        return Long.compare(o1.seqNum, o2.seqNum);
    }
}

class Main 
{
    public static void main(String [] args)
    {
        long sequenceCounter = 0;
        
        System.out.println("--- Simulating Stack (LIFO) ---");
        PriorityQueue<Entry<String>> stack = new PriorityQueue<>(new StackComparator<>());
        
        stack.offer(new Entry<>("First In", sequenceCounter++));
        stack.offer(new Entry<>("Second In", sequenceCounter++));
        stack.offer(new Entry<>("Third In", sequenceCounter++));
        
        while (!stack.isEmpty()) {
            System.out.println(stack.poll());
        }

        System.out.println("\n--- Simulating Queue (FIFO) ---");
        sequenceCounter = 0;
        PriorityQueue<Entry<String>> queue = new PriorityQueue<>(new QueueComparator<>());
        
        queue.offer(new Entry<>("First In", sequenceCounter++));
        queue.offer(new Entry<>("Second In", sequenceCounter++));
        queue.offer(new Entry<>("Third In", sequenceCounter++));
        
        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }
    }
}
