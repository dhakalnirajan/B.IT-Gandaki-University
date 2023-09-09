// Program 1 from PDF

interface Bark {
  void bark();
}

class Dog implements Bark {

  public void bark() {
    System.out.println("A dog barks!");
  }
}

class Test {

  public static void main(String[] args) {
    Dog d = new Dog();
    d.bark();
  }
}
