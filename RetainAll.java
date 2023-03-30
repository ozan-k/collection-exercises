import java.util.*;
public class RetainAll {
   public static void main(String[] args) {
      List<String> friends = new ArrayList<>();
      friends.add("Chandler");
      friends.add("Joey");
      friends.add("Monica");
      friends.add("Phoebe");
      System.out.println(friends);

      List<String> noLongerFriends = new ArrayList<>();
      noLongerFriends.add("Monica");
      noLongerFriends.add("Phoebe");
      System.out.println(noLongerFriends);

      friends.retainAll(noLongerFriends);
      System.out.println(friends);
   }
}
