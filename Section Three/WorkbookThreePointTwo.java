public class WorkbookThreePointTwo {
  public static void main(String[] args) {
    double wallet = 100;
    double toyCar = 5.99;
    double nike = 95.99;
    System.out.println("Can I get this car?");

    if (wallet >= toyCar) {
      System.out.println("sure");
      wallet -= toyCar;
    } else {
      System.out.println("sorry, i only have $" + wallet + " left");
    }

    System.out.println("Can I get this shoe?");

    if (wallet >= nike) {
      System.out.println("sure");
      wallet -= nike;
    } else {
      System.out.println("sorry, i only have $" + wallet + " left");
    }

  }
}
