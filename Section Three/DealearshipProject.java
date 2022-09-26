import java.util.Scanner;

public class DealearshipProject {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.println("Welcome to the Java Dealership");
    System.out.println(" . select option 'a' to buy a car");
    System.out.println(" . select option 'b' to sell a car");

    String option = scan.nextLine();

    switch(option){
      case "a": System.out.println("You choose option " + option);
        System.out.println("What is your budget");
        int budget = scan.nextInt();
        if (budget > 10_000) {
          System.out.println("Great, a Nissan Ultima ia available");
          System.out.println("\nDo you have insurance, Write 'yes' or 'no'");
          scan.nextLine();
          String insurance = scan.nextLine();
          System.out.println("\nDo you have a drivers license, Write 'yes' or 'no'");
          String license = scan.nextLine();
          System.out.println("\nWhat is your credit score, Write an integer");
          int creditScore = scan.nextInt();

          if (license.equals("yes") && insurance.equals("yes") && creditScore >= 660){
            System.out.println("Sold! pleasure doing business with you");
          } else {
            System.out.println("Sorry, you did not fulfill one or more requirements to purchase the vehicles");
          }



        } else {
          System.out.println("Sorry, we don't sell cars under $10,000 budget");
        }

      break;
      case "b": System.out.println("You choose option " + option);
        System.out.println("\nWhat is your car valued at?");
        int value = scan.nextInt();
        System.out.println("\nWhat is your selling price");
        int sellPrice = scan.nextInt();

        if(value > sellPrice && sellPrice < 30000) {
          System.out.println("\nWe will buy your vehicle, pleasure doing business with you");
        } else {
          System.out.println("\nSorry, we are not interested");
        }
      break;
      default: System.out.println("Invalid option");
    }

    scan.close();
  }  
}
