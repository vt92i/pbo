public class Person {
    private String fullName;
    private int age;

//    public Person(String fullName, int age) {
//        this.fullName = fullName;
//        this.age = age;
//    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void print() {
        System.out.println("Full name : " + this.fullName);
        System.out.println("Age : " + this.age);
    }
}
