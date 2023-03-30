import java.util.*;

public class TreeMapDemo {
  public static void main(String[] args) {
      TreeMap<String, Integer> treeMap = new TreeMap<>();
      treeMap.put("Rajesh", 26);
      treeMap.put("Sheldon", 30);
      treeMap.put("Leonard", 25);
      System.out.println("A map that keeps a natural ordering: "+treeMap);
  }
}
