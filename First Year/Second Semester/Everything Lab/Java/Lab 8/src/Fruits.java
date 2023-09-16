import mypackage.Foods;

public class Fruits {

  public static void main(String[] args) {
    Foods foodObj = new Foods();
    foodObj.setFood("Apples", 50);
    findFruitSeason("Apples");
  }

  public static void findFruitSeason(String fruitName) {
    if (fruitName.equalsIgnoreCase("Apples")) {
      System.out.println(fruitName + " are found in the fall season.");
    } else {
      System.out.println("Season information not available for " + fruitName);
    }
  }
}
