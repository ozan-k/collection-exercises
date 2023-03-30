import java.util.ArrayList;
import java.util.Collections;

public class FillFrequencyDemo {
  public static void main(String[] args) {
    ArrayList<String> list = new ArrayList<>();
    list.add("Rick");
    list.add("Morty");
    list.add("Summer");

    System.out.println("Original: " + list);
    Collections.fill(list, "Mr. Meeseeks");
    System.out.println("Filled: " + list);

    int frequency = Collections.frequency(list, "Mr. Meeseeks");
    System.out.println("Frequency of \"Mr. Meeseeks\": " + frequency);
  }
}
