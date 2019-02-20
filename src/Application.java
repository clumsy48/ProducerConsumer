import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class Application {

    public static void main(String[] args) {
        BlockingQueue<Message> messageQueue = new ArrayBlockingQueue<>(10);
        Producer producer = new Producer(messageQueue);
        Consumer consumer = new Consumer(messageQueue);
        new Thread(producer).start();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        new Thread(consumer).start();
    }
}
