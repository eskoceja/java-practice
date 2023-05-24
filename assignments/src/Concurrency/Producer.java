package Concurrency;

import java.util.Random;

//DONE - Accept a reference to the SharedBuffer object.
//DONE - Generate random numbers.
//DONE - Add the random numbers to the shared buffer using the appropriate synchronized method.

public class Producer implements Runnable {
    private final SharedBuffer buffer;

    public Producer(final SharedBuffer buffer) {
        this.buffer = buffer;
    }

    @Override
    public void run() {
        Random random = new Random();

        for (int i = 0; i <= 10; i++) {

            int number = random.nextInt(20);
            buffer.addToBuffer(number);
            System.out.println("Producer produced: " + number);

            try {
                Thread.sleep(random.nextInt(1000));///?
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
