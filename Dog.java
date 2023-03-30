public class Dog {

  private String name;
  private int age;

  public Dog(String name, int age) {
    setName(name);
    setAge(age);
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    if (age < 0 || age > 15)
      throw new IllegalArgumentException("Invalid age: " + age + ". Must be 0 <= age <= 15");
    this.age = age;
  }

  @Override
  public String toString() {
    return "(" + name + ", " + age + ')';
  }
}
