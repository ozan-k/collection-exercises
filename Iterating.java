import java.util.*;

public class Iterating {
   public static void main(String[] args) {
      Map<String, Integer> gradesMap = new HashMap<>();
      gradesMap.put("Sheldon", 30);
      gradesMap.put("Leonard", 25);
      gradesMap.put("Rajesh", 26);
      gradesMap.put("Howard", 21);
      System.out.println(gradesMap);

      // Iterate using a for-each loop on the KEYS in the map
      for (String key : gradesMap.keySet()) {
         System.out.println("("+key + ", " + gradesMap.get(key)+")");
      }

      // Iterate using a for-each loop on the VALUES in the map
      for (Integer value : gradesMap.values()) {
         System.out.println(value);
      }

      // Iterate using a for-each loop on the ENTRIES in the map
      for (Map.Entry entry : gradesMap.entrySet()) {
         System.out.println(entry);
      }

      // Iterate using a forEach method
      gradesMap.forEach( (key, value) -> System.out.println(key + ": " + value));
   }
}
