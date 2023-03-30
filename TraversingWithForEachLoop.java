import java.util.ArrayList;
import java.util.Collection;

class TraversingWithForEachLoop {
	public static void main(String args[]){
		Collection<String> friends = new ArrayList<>();

		friends.add("Chandler");
		friends.add("Joey");
		friends.add("Monica");
		friends.add("Rachel");
		friends.add("Ross");
		friends.add("Phoebe");

		// Traversing the collection using a for-each loop
		for (String friend : friends) {
			System.out.println(friend);
		}
	}
}
