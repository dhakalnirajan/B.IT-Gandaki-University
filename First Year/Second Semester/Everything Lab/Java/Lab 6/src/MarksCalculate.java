/*
Create an abstract class 'Marks' with an abstract method 'getPercentage'. It is inherited
by two other classes 'A' and 'B' each having a method with the same name which
returns the percentage of the students. The constructor of student A takes the marks in
three subjects as its parameters and the marks in four subjects as its parameters for
student B.Calculate the percentage of marks obtained in three subjects (each out of
100) by student A and in four subjects (each out of 100) by student B. Create an object
for each of the two classes and print the percentage of marks for both the students.
*/

abstract class Marks {

  abstract int getPercentage();
}

class A extends Marks {

  int m1, m2, m3;

  A(int m1, int m2, int m3) {
    this.m1 = m1;
    this.m2 = m2;
    this.m3 = m3;
    System.out.println(
      "Marks in three subjects are: " + m1 + ", " + m2 + ", " + m3
    );
  }

  int getPercentage() {
    return (m1 + m2 + m3) / 3;
  }
}

class B extends Marks {

  int m1, m2, m3, m4;

  B(int m1, int m2, int m3, int m4) {
    this.m1 = m1;
    this.m2 = m2;
    this.m3 = m3;
    this.m4 = m4;
    System.out.println(
      "Marks in four subjects are: " + m1 + ", " + m2 + ", " + m3 + ", " + m4
    );
  }

  int getPercentage() {
    return (m1 + m2 + m3 + m4) / 4;
  }
}

class MarksCalculate {

  public static void main(String[] args) {
    A a = new A(93, 89, 98);
    B b = new B(100, 93, 86, 96);
    System.out.println(
      "Percentage of marks in three subjects is: " + a.getPercentage()
    );
    System.out.println(
      "Percentage of marks in four subjects is: " + b.getPercentage()
    );
  }
}
