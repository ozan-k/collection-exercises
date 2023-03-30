import java.util.*;
public class ContainsIndexOfClearSize {
   public static void main(String[] args) {
      List<String> friends = new ArrayList<>();
      friends.add("Chandler");
      friends.add("Joey");
      friends.add("Monica");

      // Checking if the array contains an element
      System.out.println("Contains Joey? " + friends.contains("Joey"));
      System.out.println("Contains Phoebe? " + friends.contains("Phoebe"));

      // Getting the index of an element
      System.out.println("IndexOf Joey? " + friends.indexOf("Joey"));

      // Getting the size of the list
      System.out.println("Size:" + friends.size());

      // Removing all elements from the list
      friends.clear();
      System.out.println("Size:" + friends.size());
   }
}
