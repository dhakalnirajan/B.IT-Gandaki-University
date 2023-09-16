/*
Create a class Employee with a package named Pack and access the variables of employee as emp_id, name, age. Create another class Engineer
and access the variables of the Employee class.
*/

package pack;

public class Employee {

  public int id;
  public String name;
  public int age;

  public Employee(int id, String name, int age) {
    this.id = id;
    this.name = name;
    this.age = age;
  }
}
