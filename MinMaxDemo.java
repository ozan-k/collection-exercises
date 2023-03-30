import java.util.*;

public class MinMaxDemo {

   public static void main(String[] args) {
      ArrayList<String> list = new ArrayList<>();
      list.add("Rick");
      list.add("Morty");
      list.add("Summer");
      list.add("Beth");

      System.out.println(list);

      String min = Collections.min(list);
      System.out.println("Min: " + min);

      String max = Collections.max(list);
      System.out.println("Max: " + max);
   }

}
