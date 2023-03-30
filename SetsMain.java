import java.util.*;

public class SetsMain{
    public static void main(String[] args) {
      Set<String> hashSet = new HashSet<>();
      hashSet.add("Joey");
      hashSet.add("Joey");
      hashSet.add("Rachel");
      hashSet.add("Monica");
      hashSet.add("Chandler");
      System.out.println("HashSet (no order guaranteed): " + hashSet);

      Set<String> linkedHashSet = new LinkedHashSet<>();
      linkedHashSet.add("Joey");
      linkedHashSet.add("Joey");
      linkedHashSet.add("Rachel");
      linkedHashSet.add("Monica");
      linkedHashSet.add("Chandler");
      System.out.println("LinkedHashSet (insertion order maintained): " + linkedHashSet);

      Set<String> treeSet = new TreeSet<>();
      treeSet.add("Joey");
      treeSet.add("Joey");
      treeSet.add("Rachel");
      treeSet.add("Monica");
      treeSet.add("Chandler");
      System.out.println("TreeSet (natural order maintained): " + treeSet);
    }
}
