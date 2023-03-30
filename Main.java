
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

    removeDuplicates(dogs);
    System.out.println(dogs);
    // => [(King, 5), (Rex, 7), (Boss, 2), (Duke, 11)]
  }

  static void removeDuplicates(ArrayList<Dog> dogs) {
     ArrayList<Dog> result = new ArrayList<>();
     for (Dog dog : dogs){
         if (!(result.contains(dog))){
            result.add(dog);
         }
     }
     dogs.clear();
     dogs.addAll(result);
  }

}
