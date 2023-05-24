package Concurrency;

import java.util.LinkedList;
import java.util.Queue;

//DONE - Store and manage the buffer.
//DONE - Limit the maximum buffer size.
//DONE - Provide synchronized methods for adding elements to and removing elements from the buffer.
//DONE - Use wait() and notifyAll() methods to coordinate access to the buffer.


public class SharedBuffer {
    private final Queue<Integer> buffer = new LinkedList<>();
    private final int maxSize;

    public SharedBuffer(int maxSize) {
        this.maxSize = maxSize;
    }

    public synchronized void addToBuffer(int number) {

        while (buffer.size() == maxSize) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        buffer.add(number);
        notifyAll();

    }

    public synchronized int removeFromBuffer() {
        while (buffer.isEmpty()) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        int number = buffer.remove();
        notifyAll();
        return number;
    }

}
