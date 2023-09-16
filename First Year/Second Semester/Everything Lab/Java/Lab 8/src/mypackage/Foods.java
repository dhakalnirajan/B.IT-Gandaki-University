package mypackage;

public class Foods {

  private String foodName;
  private int total;

  public void display() {
    System.out.println("Displaying Foods");
  }

  public void setFood(String fname, int n) {
    this.foodName = fname;
    this.total = n;
    System.out.println("There are" + this.total + "number of " + this.foodname);
  }
}
