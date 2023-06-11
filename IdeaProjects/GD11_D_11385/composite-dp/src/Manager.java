import java.util.ArrayList;
import java.util.List;

public class Manager implements IEmployee {
  private final String name, role;
  private final int age;
  private final List<IEmployee> employees = new ArrayList<>();

  public Manager(String name, int age, String role) {
    this.name = name;
    this.age = age;
    this.role = role;
  }

  public void addEmployee(IEmployee employee) {
    employees.add(employee);
  }

  public void removeEmployee(IEmployee employee) {
    employees.remove(employee);
  }

  public List<IEmployee> getEmployees() {
    return employees;
  }

  public void printEmployees() {
    for (IEmployee employee : employees) {
      employee.print();
    }
  }

  @Override
  public void print() {
    System.out.println("Name: " + name);
    System.out.println("Age: " + age);
    System.out.println("Role: " + role);
  }
}
