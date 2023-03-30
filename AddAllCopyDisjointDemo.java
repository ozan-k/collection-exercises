import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AddAllCopyDisjointDemo {

   public static void main(String[] args) {
      List<String> list = new ArrayList<>();
      System.out.println("List: " + list);
      Collections.addAll(list, "Rick", "Morty", "Summer");
      System.out.println("List: " + list + "\n");

      List<String> list2 = List.of("Beth", "Jerry", "Birdperson");
      System.out.println("List2: " + list2);
      System.out.println("Is list2 disjoint? " + Collections.disjoint(list, list2) + "\n");

      List<String> list3 = new ArrayList<>(list2);
      System.out.println("List3: " + list3);
      System.out.println("Is list3 disjoint? " + Collections.disjoint(list, list3));
      Collections.copy(list3, list);
      System.out.println("List3: " + list3);
      System.out.println("Is list3 disjoint? " + Collections.disjoint(list, list3));
   }

}
