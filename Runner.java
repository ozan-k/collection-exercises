import java.util.*;

public class Runner {

	public static void main(String[] args) {
		List<String> friends = new ArrayList<>();

		friends.add("Rachel");
		friends.add("Ross");
		friends.add("Joey");
		friends.add("Monica");
		friends.add("Phoebe");
		friends.add("Chandler");
		System.out.println(friends);

		String thirdFriend = friends.get(2);
		System.out.println("Third element: "+ thirdFriend);

		for (String friend : friends) {
			System.out.println("Hello! I'm "+friend+".");
		}
	}
}
