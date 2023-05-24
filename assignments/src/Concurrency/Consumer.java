package Concurrency;

import java.util.Random;

//    DONE - Accept a reference to the SharedBuffer object.
//    DONE - Retrieve numbers from the shared buffer using the appropriate synchronized method.
//    DONE - Calculate the sum of the retrieved numbers.

public class Consumer implements Runnable {
    private final SharedBuffer buffer;
    private int sum;

    public Consumer(final SharedBuffer buffer) {
        this.buffer = buffer;
        this.sum = 0;
    }

    @Override
    public void run() {
        Random random = new Random();

        for (int i = 0; i <= 10; i++) {
            int number = buffer.removeFromBuffer();
            System.out.println("Consumer consumed: " + number);
            sum = sum + number;
            try {
                Thread.sleep(random.nextInt(800));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("The sum is: " + sum);
    }
}
