import java.util.*;

public class HashMapDemo {
   public static void main(String[] args) {
      // Constructs an empty map
      Map<String, Integer> gradesMap = new HashMap<>();

      // Adding entries to the map
      gradesMap.put("Sheldon", 30);
      gradesMap.put("Leonard", 25);
      gradesMap.put("Rajesh", 26);
      System.out.println(gradesMap);

      // Getting the value for an existing key
      System.out.println("Leonard's grade: "+gradesMap.get("Leonard"));

      // Remember that keys are unique in a map.
      // Adding an entry for an existing key replaces the existing value
      gradesMap.put("Rajesh", 18);
      System.out.println(gradesMap);

      System.out.println("Is Rajesh's grade declared? "+gradesMap.containsKey("Rajesh"));
      System.out.println("Did anyone get the maximum score? "+gradesMap.containsValue(30));

      Map<String, Integer> gradesMap2 = new HashMap<>();
      gradesMap2.put("Howard", 22);
      // Adding all entries from secondGradeMap into gradesMap
      gradesMap.putAll(gradesMap2);
      System.out.println(gradesMap);
   }
}
