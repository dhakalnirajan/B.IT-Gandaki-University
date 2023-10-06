/*
Write a program to create a class Room along with two methods getData() to get the value
through argument and printData() to display the data in printData. Create the two objects s1 ,s2
to declare and access the values from class STTest
*/

class Room {

  int roomNo;
  int roomType;
  int roomPrice;

  public void getData(int roomNo, int roomType, int roomPrice) {
    this.roomNo = roomNo;
    this.roomType = roomType;
    this.roomPrice = roomPrice;
  }

  public void printData() {
    System.out.println("Room No: " + roomNo);
    System.out.println("Room Type: " + roomType);
    System.out.println("Room Price: " + roomPrice);
  }
}

class STTest {

  public static void main(String[] args) {
    Room s1 = new Room();
    Room s2 = new Room();
    s1.getData(101, 1, 10000);
    s1.printData();
    s2.getData(201, 2, 20000);
    s2.printData();
  }
}
