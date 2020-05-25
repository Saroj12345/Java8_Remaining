import java.util.Queue;
import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class ProducerConsumerProblem {

    public static void main(String[] args) {

        BlockingQueue<Integer> sharedQueue = new ArrayBlockingQueue(10);

        //producer
        Runnable producer = () -> {
            try {
                while (true) {
                    Integer i = new Random().nextInt(4);
                    sharedQueue.put(i);
                    System.out.println("Producer is Producing "+i);
                    Thread.sleep(2000);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };

        new Thread(producer).start();
        //new Thread(producer).start();

        //consumer
        Runnable consumer = () -> {
            try {
                while (true) {
                    Integer i = sharedQueue.take();
                    System.out.println("Consumer is consuming "+i);
                    Thread.sleep(1000);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };
        new Thread(consumer).start();
    }
}
