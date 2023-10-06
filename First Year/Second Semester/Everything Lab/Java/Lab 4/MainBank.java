class Bank {

  String name;

  Bank(String name) {
    this.name = name;
  }
}

class Department extends Bank {

  int number;

  Department(String name, int number) {
    super(name);
    this.number = number;
  }
}

class Post extends Department {

  String post;

  Post(String name, int number, String post) {
    super(name, number);
    this.post = post;
  }

  void display() {
    System.out.println("Enter name:" + name);
    System.out.println("Enter number:" + number);
    System.out.println("Enter post:" + post);
  }
}

public class MainBank {

  public static void main(String[] args) {
    Post b = new Post("Nepal Investment Mega Bank", 1, "OFFICER");
    b.display();
  }
}
