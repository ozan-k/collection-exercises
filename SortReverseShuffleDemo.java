import java.util.ArrayList;
import java.util.Collections;

public class SortReverseShuffleDemo {
   public static void main(String[] args) {
      ArrayList<String> list = new ArrayList<>();
      list.add("Rick");
      list.add("Morty");
      list.add("Summer");
      list.add("Beth");

      System.out.println("Original: " + list);

      Collections.sort(list);
      System.out.println("Sorted: " + list);

      Collections.reverse(list);
      System.out.println("Reversed: " + list);

      Collections.shuffle(list);
      System.out.println("Shuffled: " + list);
   }
}
