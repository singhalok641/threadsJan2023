package OS5.ProducerConsumer;

import java.util.Queue;

public class Producer implements Runnable{
    private Queue<Object> queue;
    private int maxSize;
    private String name;

    public Producer(Queue queue, int maxSize, String name){
        this.queue = queue;
        this.maxSize = maxSize;
        this.name = name;
    }

    @Override
    public void run() {
        while (true){
            synchronized (queue) {
                if (queue.size() < maxSize) {
                    System.out.println(this.name + " Adding an element. Queue size: " + queue.size());
                    queue.add(new Object());
                }
            }
        }
    }
}
