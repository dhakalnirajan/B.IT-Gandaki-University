/*
Create an abstract class 'Bank' with an abstract method 'getBalance'. 'BankA', and
'BankB' are subclasses of class 'Bank', each having a method named 'getBalance' with
a parameter of balance. Consider BankA contains implementation details and Rs
10,000 gets deposited in BankA. But BankB does not contain implementation. Extend
class BankC from class BankB with the same method and deposit Rs20,000. Call this
method with arguments by creating an object of the classes from the main class.
*/

abstract class Bank {

  abstract void getBalance(int balance);
}

class BankA extends Bank {

  void getBalance(int balance) {
    System.out.println("Rs." + balance + " is deposited in BankA");
  }
}

class BankB extends Bank {

  void getBalance(int balance) {
    System.out.println(" ");
  }
}

class BankC extends BankB {

  void getBalance(int balance) {
    System.out.println("Rs." + balance + " is deposited in BankC");
  }
}

class BankMain {

  public static void main(String[] args) {
    BankA a = new BankA();
    a.getBalance(10000);

    BankB b = new BankB();
    b.getBalance(20000);

    BankC c = new BankC();
    c.getBalance(20000);
  }
}
