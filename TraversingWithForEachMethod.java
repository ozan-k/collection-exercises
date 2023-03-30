import java.util.Collection;
import java.util.ArrayList;

class TraversingWithForEachMethod {
	public static void main(String args[]){
		Collection<String> friends = new ArrayList<>();

		friends.add("Chandler");
		friends.add("Joey");
		friends.add("Monica");
		friends.add("Rachel");
		friends.add("Ross");
		friends.add("Phoebe");

		// Traversing the collection using a forEach method
		friends.forEach( friend -> System.out.println(friend) );
	}
}
