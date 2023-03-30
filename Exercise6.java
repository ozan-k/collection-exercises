import java.util.*;

class Exercise6 {
    public static void main(String[] args){
        Map<String,String> hashMap = new HashMap<>();
        Map<String,String> linkedHashMap = new LinkedHashMap<>();
        Map<String,String> treeMap = new TreeMap<>();
        hashMap.put("tallest","150");
        linkedHashMap.put("tallest","150");
        treeMap.put("tallest","150");
        hashMap.put("shortest","50");
        linkedHashMap.put("shortest","50");
        treeMap.put("shortest","50");
        hashMap.put("mid","100");
        linkedHashMap.put("mid","100");
        treeMap.put("mid","100");
        System.out.println("~~~~~~~~~~");
        System.out.println("HashMap");
        for (Map.Entry m : hashMap.entrySet()) {
         System.out.println(m.getKey() + " -> "+m.getValue());
        }
        System.out.println("~~~~~~~~~~");
        System.out.println("LinkedHashMap");
        for (Map.Entry m : linkedHashMap.entrySet()) {
          System.out.println(m.getKey() + " -> "+m.getValue());
        }
        System.out.println("~~~~~~~~~~");
        System.out.println("TreeMap");
        for (Map.Entry m : treeMap.entrySet()) {
          System.out.println(m.getKey() + " -> "+m.getValue());
        }
    }
}
