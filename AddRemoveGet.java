import java.util.*;
public class AddRemoveGet {
   public static void main(String[] args) {
      List<String> friends = new ArrayList<>();
      // Adding elements to the list
      friends.add("Chandler");
      friends.add("Joey");
      friends.add("Monica");
      friends.add("Phoebe");
      System.out.println(friends);

      // Removing an element from the list
      friends.remove("Joey");
      // Removing the element at a given index from the list
      friends.remove(0);
      System.out.println(friends);

      // Getting an element from the list at a given index
      String firstFriend = friends.get(0);
      System.out.println("First friend: " + firstFriend);
      // Get does not remove the element from the list
      System.out.println(friends);
   }
}
