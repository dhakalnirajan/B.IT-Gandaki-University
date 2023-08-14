// WAP in Java to create a class Animal with method makeSound() that represents a sound. Also extend class Dog from Animal with the same method. Also, extend class Cat from the class Dog with the same method. Create an object of each class and call the method makeSound(). Using the concept of method overriding and super keyword and necessary variables, access the methods from main class Mammal.

class Animal {

  public void makeSound() {
    System.out.println("Animal Sound");
  }
}

class Dog extends Animal {

  public void makeSound() {
    System.out.println("Dog Sound: Bark");
  }
}

class Cat extends Dog {

  public void makeSound() {
    super.makeSound();
    System.out.println("Cat Sound: Meow");
  }
}

class Mammal {

  public static void main(String args[]) {
    Animal a = new Animal();
    Dog d = new Dog();
    Cat c = new Cat();
    a.makeSound();
    c.makeSound();
  }
}
