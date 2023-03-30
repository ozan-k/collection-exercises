import java.util.*;

class LinkedListDemo{
    public static void main(String[] args){
        LinkedList<String> list = new LinkedList<>();
        // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Adding elements");
        // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

        // Appends the specified element to the end of this list.
        list.add("Sheldon");
        list.add("Leonard");
        System.out.println(list);

        // Adds the specified element as the tail (last element) of this list.
        list.offer("Howard");
        System.out.println(list);

        // Inserts the specified element at the front of this list.
        list.offerFirst("Rajesh");
        System.out.println(list);

        // Inserts the specified element at the end of this list.
        list.offerLast("Amy");
        System.out.println(list);

        // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Removing elements");
        // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

        list.clear();
        list.offer("Sheldon");
        list.offer("Leonard");
        list.offer("Howard");
        list.offer("Rajesh");
        list.offer("Amy");
        list.offer("Penny");
        System.out.println(list);

        // Removes the first occurrence of the specified element from this list, if it is present.
        list.remove("Howard");
        System.out.println(list);

        // Retrieves and removes the head (first element) of this list.
        System.out.println("Polled: " + list.poll());

        // Removes and returns the first element from this list. Throws NoSuchElementException if this list is empty
        System.out.println("Removed first: " + list.removeFirst());

        // Retrieves and removes the first element of this list or returns null if this list is empty.
        System.out.println("Polled first: " + list.pollFirst());

        // Removes and returns the last element from this list. Throws NoSuchElementException if this list is empty
        System.out.println("Removed last:" + list.removeLast());

        // Retrieves and removes the last element of this list or returns null if this list is empty.
        System.out.println("Polled last:" + list.pollLast());

        // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Retrieving elements");
        // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

        list.clear();

        list.offer("Sheldon");
        list.offer("Leonard");
        list.offer("Howard");
        list.offer("Rajesh");
        System.out.println(list);

        // Returns the element at the specified position in this list
        System.out.println("The third in the list is " + list.get(2));

        // Returns the first element in this list. Throws an exception if list is empty.
        System.out.println("The first element in the list is " + list.getFirst());

        // Retrieves, but does not remove, the first element of this list, or returns null if this list is empty.
        System.out.println("The first element in the list is " + list.peekFirst());

        // Returns the last element in this list. Throws an exception if list is empty.
        System.out.println("The last element in the list is " + list.getLast());

        // Retrieves, but does not remove, the last element of this list, or returns null if this list is empty.
        System.out.println("The last element in the list is " + list.peekLast());

        // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Additional methods");
        // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

        list.clear();
        list.offer("Sheldon");
        list.offer("Leonard");
        list.offer("Howard");
        list.offer("Rajesh");
        list.offer("Leonard");
        System.out.println(list);

        // Returns the number of elements in this list
        System.out.println("The size of the list is " + list.size());

        // Returns true if this list contains the specified element.
        System.out.println("Does the list contain Sheldon? " + list.contains("Sheldon"));

        // Returns the index of the first occurrence of the specified element
        // in this list, or -1 if this list does not contain the element.
        System.out.println("First index of Leonard? " + list.indexOf("Leonard"));

        // Returns the index of the last occurrence of the specified element
        // in this list, or -1 if this list does not contain the element.
        System.out.println("Last index of Leonard? " + list.lastIndexOf("Leonard"));
                // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

    }
}
