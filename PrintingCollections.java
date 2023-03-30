import java.util.*;

public class PrintingCollections {
   public static void main(String[] args) {
      Collection<String> friends = new ArrayList<>();

      friends.add("Chandler");
      friends.add("Joey");
      friends.add("Monica");
      friends.add("Rachel");
      friends.add("Ross");
      friends.add("Phoebe");

      // Option #1
      System.out.println(friends);

      // Option #2
      String value = "{ " + String.join(" - ", friends) + " } ";
      System.out.println(value);
   }
}
