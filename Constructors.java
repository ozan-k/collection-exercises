import java.util.*;
class Constructors {
	public static void main(String args[]){
		// Builds an empty array list.
		ArrayList<String> names = new ArrayList<>();
		System.out.println("Empty list: " + names);
		names.add("Joey");

		// Build an array list from an existing collection
		ArrayList<String> names2 = new ArrayList<>(names);
		System.out.println("New list from previous list: " + names2);

		// Builds an empty array list that has the specified initial capacity.
		ArrayList<String> names3 = new ArrayList<>(5);
		// The size of the array is still zero
		System.out.println(names3.size());
		// And this statement will throw an exception
		//names3.set(2, "Joey");
	}
}
