public class Developer implements IEmployee {
  private final String name;
  private final int age;
  private final String role;

  public Developer(String name, int age, String role) {
    this.name = name;
    this.age = age;
    this.role = role;
  }

  @Override
  public void print() {
    System.out.println("Name: " + name);
    System.out.println("Age: " + age);
    System.out.println("Role: " + role);
  }
}
