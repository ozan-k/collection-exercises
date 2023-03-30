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
    dogs.add(d2);
    dogs.add(d3);
    dogs.add(d4);

    System.out.println(dogs);
    // => [(King, 5), (Rex, 7), (Boss, 2), (Duke, 11)]
    printIfOlderThanTen(dogs);
    // => Dogs older than 10:
    // => (Duke, 11)
    printIfOlderThanAverage(dogs);
    // => Dogs older than 6.25 (average):
    // => (Rex, 7)
    // => (Duke, 11)
  }

  private static void printIfOlderThanTen(ArrayList<Dog> dogs) {
       System.out.println("Dogs older than " + 10 + ":");
       for (Dog dog : dogs) {
          if (dog.getAge() > 10) {
             System.out.println(dog);
             }
       }
    }


  private static void printIfOlderThanAverage(ArrayList<Dog> dogs) {
      double average = getAverage(dogs);
      System.out.println("Dogs older than " + average + "(average):");
      for (Dog dog : dogs){
          if (dog.getAge() > average){
              System.out.println(dog);
          }
      }

  }

  private static double getAverage(ArrayList<Dog> dogs) {
    double sum = 0;
    for (Dog dog : dogs){
        sum += dog.getAge();
    }
    return sum / dogs.size();
  }
}
