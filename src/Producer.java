import java.util.Queue;

public class Producer implements Runnable{
    private Queue<Message> broker;

    public Producer(Queue<Message> messages) {
        this.broker = messages;
    }
    @Override
    public void run() {
        int counter = 1;
        while (true){
            this.broker.offer(Message.builder().id(String.valueOf(counter)).text("hola").build());
            System.out.println("Producer pushed "+counter);
            try {
                Thread.sleep(250);
            } catch (InterruptedException e) {
                System.out.println("Producer Iterrupted");
            }
            counter++;
        }

    }
}
