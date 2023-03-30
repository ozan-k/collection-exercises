import java.util.*;

public class EmptyCollectionFactoryDemo {

   public static void main(String[] args) {
      List<String> list = Collections.emptyList();
      System.out.println("Empty list: " + list);
      // These factory methods create immutable collections.
      // If you try to add a value, the operation will throw an exception
      // list.add("UNIBZ");

      Set<String> set = Collections.emptySet();
      System.out.println("Empty set: " + set);

      SortedSet<String> sortedSet = Collections.emptySortedSet();
      System.out.println("Empty sorted set: " + sortedSet);

      Iterator<String> iterator = Collections.emptyIterator();
      System.out.println("Empty iterator: hasNext()? " + iterator.hasNext());

      ListIterator<String> listIterator = Collections.emptyListIterator();
      System.out.println("Empty list iterator: hasNext()? " + listIterator.hasNext());
   }

}
