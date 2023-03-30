import java.util.*;

class TraversingWithIterator {
	public static void main(String args[]){
		// Creating the collection
		Collection<String> friends = new ArrayList<>();

		// Adding objects in the colleciton
		friends.add("Chandler");
		friends.add("Joey");
		friends.add("Monica");
		friends.add("Rachel");
		friends.add("Ross");
		friends.add("Phoebe");

		// Traversing the collection using an Iterator
		Iterator<String> itr = friends.iterator();

		while(itr.hasNext()){
			String friend = itr.next();
			System.out.println(friend);
		}
	}
}
