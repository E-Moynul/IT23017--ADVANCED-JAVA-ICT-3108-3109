//IT23017
import java.util.LinkedList;
import java.util.Queue;

class Car {
    private final int id;

    public Car(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }
}

class ParkingPool {
    private final Queue<Car> orderQueue = new LinkedList<>();
    private final int capacity;

    public ParkingPool(int capacity) {
        this.capacity = capacity;
    }

    public synchronized void addOrder(Car car) throws InterruptedException {
        while (orderQueue.size() == capacity) {
            wait();
        }
        orderQueue.add(car);
        System.out.println("Registrar created request for Car: " + car.getId());
        notifyAll();
    }

    public synchronized Car getOrder() throws InterruptedException {
        while (orderQueue.isEmpty()) {
            wait();
        }
        Car car = orderQueue.poll();
        notifyAll();
        return car;
    }
}

class RegistrarParking implements Runnable {
    private final ParkingPool pool;
    private final int totalCars;

    public RegistrarParking(ParkingPool pool, int totalCars) {
        this.pool = pool;
        this.totalCars = totalCars;
    }

    @Override
    public void run() {
        try {
            for (int i = 1; i <= totalCars; i++) {
                Car car = new Car(i);
                pool.addOrder(car);
                Thread.sleep(100);
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}

class ParkingAgent implements Runnable {
    private final ParkingPool pool;
    private final int agentId;

    public ParkingAgent(ParkingPool pool, int agentId) {
        this.pool = pool;
        this.agentId = agentId;
    }

    @Override
    public void run() {
        try {
            while (true) {
                Car car = pool.getOrder();
                System.out.println("Agent " + agentId + " processed parking for Car: " + car.getId());
                Thread.sleep(250);
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}

public class MainClass {
    public static void main(String[] args) {
        int queueCapacity = 5;
        int totalCarsToPark = 15;
        int numberOfAgents = 3;

        ParkingPool pool = new ParkingPool(queueCapacity);

        Thread registrarThread = new Thread(new RegistrarParking(pool, totalCarsToPark));
        registrarThread.start();

        for (int i = 1; i <= numberOfAgents; i++) {
            Thread agentThread = new Thread(new ParkingAgent(pool, i));
            agentThread.start();
        }
    }
}
