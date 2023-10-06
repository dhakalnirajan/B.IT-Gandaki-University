class Student1 {

  String name, address;
  int age;

  void printData() {
    System.out.println("Student name = " + name);
    System.out.println("Student address = " + address);
    System.out.println("Student age = " + age);
  }
}

public class Test {

  public static void main(String[] args) {
    Student1 s1 = new Student1();
    Student1 s2 = new Student1();
    s1.name = "Ram";
    s1.address = "pkr";
    s1.age = 22;
    s2.name = "Sita";
    s2.address = "Ktm";
    s2.age = 23;
    s1.printData();
    s2.printData();
  }
}
