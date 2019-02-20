import java.util.concurrent.BlockingQueue;

public class Consumer implements Runnable{

    private BlockingQueue<Message> broker;

    public Consumer(BlockingQueue<Message> messages) {
        this.broker = messages;
    }
    @Override
    public void run() {
        while (true){
            try {
                Message message = this.broker.take();
                System.out.println("Producer popped "+message.toString());
                Thread.sleep(100);
            } catch (InterruptedException e) {
                System.out.println("Producer Iterrupted");
            }
        }

    }
}
