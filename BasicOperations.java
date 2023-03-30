import java.util.*;

public class BasicOperations {
   public static void main(String[] args) {
      Collection<String> friends = new ArrayList<>();

      friends.add("Chandler");
      friends.add("Joey");
      friends.add("Monica");

      System.out.println(friends);

      friends.remove("Joey");

      System.out.println(friends);

      System.out.println("Contains Monica? " + friends.contains("Monica"));
      System.out.println("Contains Joey? " + friends.contains("Joey"));

      System.out.println("Collection size: " + friends.size());
   }
}
