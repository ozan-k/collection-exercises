
import java.util.*;

public class Main {
  public static void main(String[] args) {
    ArrayList<Dog> dogs;

    Dog d1 = new Dog("King", 5);
    Dog d2 = new Dog("Rex", 7);
    Dog d3 = new Dog("Boss", 2);
    Dog d4 = new Dog("Duke", 11);

    dogs = new ArrayList<>();

    dogs.add(d1);
    dogs.add(d1);
    dogs.add(d2);
    dogs.add(d2);
    dogs.add(d3);
    dogs.add(d3);
    dogs.add(d4);
    dogs.add(d4);

    System.out.println(dogs);
    // => [(King, 5), (King, 5), (Rex, 7), (Rex, 7), (Boss, 2), (Boss, 2), (Duke, 11), (Duke, 11)]

    removeDuplicatesWithSets(dogs);
    System.out.println(dogs);
    // => [(King, 5), (Rex, 7), (Boss, 2), (Duke, 11)]
  }

  static void removeDuplicatesWithSets(ArrayList<Dog> dogs) {
     Set<Dog> dogSet = new HashSet<>(dogs);
     dogs.clear();
     dogs.addAll(dogSet);
  }

}
