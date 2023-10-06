//WAP in JAVA to Create a class Teacher with attributes name, schoolname, age. Derive a class ComputerTeacher with unique attributes as id, and access the school name from the super class. Also display the attributes of superclass through sub class.

class Teacher {

  String name, schoolname;
  int age;

  Teacher(String name, String schoolname, int age) {
    this.name = name;
    this.schoolname = schoolname;
    this.age = age;
  }
}

class ComputerTeacher extends Teacher {

  int id;

  ComputerTeacher(int id, String name, String schoolname, int age) {
    super(name, schoolname, age);
    this.id = id;
  }

  void display() {
    System.out.println("Name: " + name);
    System.out.println("School Name: " + schoolname);
    System.out.println("Age: " + age);
    System.out.println("ID: " + id);
  }
}

class TeachOut {

  public static void main(String args[]) {
    ComputerTeacher obj = new ComputerTeacher(101, "Rahul", "ABC School", 25);
    obj.display();
  }
}
