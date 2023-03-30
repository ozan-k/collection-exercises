import java.util.*;
public class AddAll {
   public static void main(String[] args) {
      List<String> friends = new ArrayList<>();
      friends.add("Chandler");
      friends.add("Joey");
      System.out.println(friends);

      List<String> newFriends = new ArrayList<>();
      newFriends.add("Monica");
      newFriends.add("Phoebe");
      System.out.println(newFriends);

      friends.addAll(newFriends);
      System.out.println(friends);
   }
}
