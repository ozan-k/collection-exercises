import java.util.Collections;
import java.util.List;
import java.util.Set;

public class SingletonFactoryDemo {

  public static void main(String[] args) {
    List<String> list = Collections.singletonList("Rick");
    System.out.println("Singleton list: " + list);
    // These factory methods create immutable collections.
    // If you try to add a value, the operation will throw an exception
    // list.add("Potter");

    Set<String> set = Collections.singleton("Rick");
    System.out.println("Singleton set: " + set);
  }

}
