public class Main {
  public static void main(String[] args) {
    Manager manager = new Manager("John", 30, "Manager");
    manager.addEmployee(new Developer("Mary", 25, "Senior Developer"));
    manager.addEmployee(new Developer("Peter", 22, "Junior Developer"));
    manager.addEmployee(new Developer("Jane", 28, "Senior Developer"));
    manager.addEmployee(new Developer("Kate", 27, "Junior Developer"));
    manager.print();
    manager.printEmployees();
  }
}
