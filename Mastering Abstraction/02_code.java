class StopWatch {
    private long startTime;
    private long stopTime;

    public void start() {
        this.startTime = System.nanoTime();
    }

    public void stop() {
        this.stopTime = System.nanoTime();
    }

    public long getElapsedNanos() {
        return (stopTime - startTime);
    }

    public double getElapsedMillis() {
        return (stopTime - startTime) / 1_000_000.0;
    }
}

interface Worker {
    int doWork(int value);
}

abstract class AbstractWorker implements Worker {
    protected int workFactor = 2;
}

class ConcreteWorker extends AbstractWorker {
    @Override
    public int doWork(int value) {
        return value * this.workFactor;
    }
}

public class Main {
    static final int WARMUP_LOOPS = 100_000_000;
    static final int TIMING_LOOPS = 500_000_000;

    public static void main(String[] args) {
        
        Worker iWorker = new ConcreteWorker();
        AbstractWorker aWorker = (AbstractWorker) iWorker;
        ConcreteWorker cWorker = (ConcreteWorker) iWorker;

        StopWatch sw = new StopWatch();
        
        for (int i = 0; i < WARMUP_LOOPS; i++) {
            iWorker.doWork(i);
            aWorker.doWork(i);
            cWorker.doWork(i);
        }

        System.out.println("Warm-up complete. Starting timed test with " + TIMING_LOOPS + " loops...");

        sw.start();
        for (int i = 0; i < TIMING_LOOPS; i++) iWorker.doWork(i);
        sw.stop();
        System.out.printf("Interface reference call:   %.2f ms\n", sw.getElapsedMillis());

        sw.start();
        for (int i = 0; i < TIMING_LOOPS; i++) aWorker.doWork(i);
        sw.stop();
        System.out.printf("Abstract class reference call: %.2f ms\n", sw.getElapsedMillis());

        sw.start();
        for (int i = 0; i < TIMING_LOOPS; i++) cWorker.doWork(i);
        sw.stop();
        System.out.printf("Concrete class reference call: %.2f ms\n", sw.getElapsedMillis());
    }
}
