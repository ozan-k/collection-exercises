import java.util.*;

public class DequeDemo {
  public static void main(String[] args) {
    Deque<String> deque = new ArrayDeque<>();

    System.out.println("deque.offer(\"Black\")");
    deque.offer("Black");
    System.out.println("deque = " + deque + "\n");

    System.out.println("deque.offer(\"White\")");
    deque.offer("White");
    System.out.println("deque = " + deque + "\n");

    System.out.println("deque.offerLast(\"Blue\")");
    deque.offerLast("Blue");
    System.out.println("deque = " + deque + "\n");

    System.out.println("deque.offerFirst(\"Red\")");
    deque.offerFirst("Red");
    System.out.println("deque = " + deque + "\n");

    System.out.println("deque.poll() => " + deque.poll());
    System.out.println("deque = " + deque + "\n");

    System.out.println("deque.pollFirst() => " + deque.pollFirst());
    System.out.println("deque = " + deque + "\n");

    System.out.println("deque.pollLast() => " + deque.pollLast());
    System.out.println("deque = " + deque + "\n");
  }
}
