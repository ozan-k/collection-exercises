import java.util.ArrayList;

public class NonGenericArrayList {
   public static void main(String[] args) {
      ArrayList list = new ArrayList();

      // It behaves as if you have done this:
      // ArrayList<Object> list = new ArrayList();

      // It accepts any object type
      list.add(2);
      list.add("John");
      list.add(true);
      list.add(5);

      System.out.println(list);

      // But you have to cast every time you retrieve an element
      Integer integer = (Integer) list.get(0);
      String string   = (String) list.get(1);

      // And wrong casting can generate an Exception
      Integer secondInteger = (Integer) list.get(3);
   }
}
