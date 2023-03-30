import java.util.*;

public class QueueDemo {
  public static void main(String[] args) {
    Queue<String> mensaQueue = new LinkedList<>();

    System.out.println("Monica arrives at the mensa queue");
    mensaQueue.offer("Monica");
    System.out.println("Queue: " + mensaQueue + "\n");

    System.out.println("Joey arrives at the mensa queue");
    mensaQueue.offer("Joey");
    System.out.println("Queue: " + mensaQueue + "\n");

    System.out.println("Serving the next person in the queue: " + mensaQueue.poll());
    System.out.println("Queue: " + mensaQueue + "\n");

    System.out.println("Ross and Rachel arrive at the mensa queue");
    mensaQueue.offer("Ross");
    mensaQueue.offer("Rachel");
    System.out.println("Queue: " + mensaQueue + "\n");

    System.out.println("Ross leaves the queue");
    mensaQueue.remove("Ross");
    System.out.println("Queue: " + mensaQueue + "\n");

    System.out.println("Serving the next person in the queue: " + mensaQueue.poll());
    System.out.println("Queue: " + mensaQueue);

    mensaQueue.add("John");
    System.out.println("Queue: " + mensaQueue + "\n");

    System.out.println("Queue examined (element): " + mensaQueue.element());
    System.out.println("Queue: " + mensaQueue + "\n");

    System.out.println("Queue removed with no argument (head): " + mensaQueue.remove());
    System.out.println("Queue: " + mensaQueue + "\n");

    mensaQueue.offer("Ross");
    mensaQueue.offer("Rachel");
    System.out.println("Queue: " + mensaQueue + "\n");

    System.out.println("Queue examined (peek): " + mensaQueue.peek());
    System.out.println("Queue: " + mensaQueue + "\n");
  }
}
