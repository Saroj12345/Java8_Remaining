import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class ProducerConsumerWithoutBlockingQueue {

    public static void main(String[] args) {


        Queue<Integer> sharedQueue = new LinkedList<>();
        int MAX_CAPACITY= 10;

        Runnable producer = () -> {
            while (true) {
                synchronized(sharedQueue) {
                    if(sharedQueue.size()==MAX_CAPACITY) {
                        try {
                            System.out.println("Producer is waiting for the Consumer to start consuming");
                            sharedQueue.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    } else {
                        Random random = new Random();
                        Integer i = random.nextInt(4);
                        sharedQueue.add(i);
                        System.out.println("Producer has produced "+i);
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        sharedQueue.notify();
                    }
                }
            }
        };




        Runnable consumer = () -> {
            while (true) {
                synchronized(sharedQueue) {
                    if(sharedQueue.isEmpty()) {
                        try {
                            System.out.println("Consumer is waiting for the Producer to put data into Queue");
                            sharedQueue.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    } else {
                        Integer i = sharedQueue.poll();
                        System.out.println("Consumer has consumed "+i);
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        sharedQueue.notify();
                    }
                }
            }
        };
        new Thread(producer).start();
        new Thread(consumer).start();
    }
}
