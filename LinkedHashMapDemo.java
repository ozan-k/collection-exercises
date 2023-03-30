import java.util.*;

public class LinkedHashMapDemo {
  public static void main(String[] args) {
      LinkedHashMap<String, Integer> linkedHashMap = new LinkedHashMap<>();

      linkedHashMap.put("Rajesh", 26);
      linkedHashMap.put("Sheldon", 30);
      linkedHashMap.put("Leonard", 25);

      System.out.println("A map that keeps insertion order: "+linkedHashMap);
  }
}
