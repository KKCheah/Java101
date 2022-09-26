import java.util.Scanner;

public class WorkbookThreePointSeven {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("\n****ROYAL BANK OF JAVA****");
    System.out.println("Are you here to get a mortgage? (yes or no)");
    String mortgage = scan.nextLine();
    
    if (mortgage.equals("yes")){
      System.out.println("\nGreat! In one line" +
      "\nHow much money do you have in your savings?" +
      "\nAnd, how much do you owe in credit card debt?");
    
      int savings = scan.nextInt();
      int creditCardDebt = scan.nextInt();

      System.out.println("\nHow many years have you worked for?");
      int yearsWork = scan.nextInt();

      System.out.println("What is your name?");
      scan.nextLine();
      String name = scan.nextLine();

      if (savings >= 10_000 && creditCardDebt < 5_000 && yearsWork >= 2) {
        System.out.println("Congratulations " + name + ", you have been approved!");
      } else {
        System.out.println("Sorry, you are not eligible for a mortgage");
      }
    } else {
      System.out.println("\nOK. Have a nice day!");
    }
    
    scan.close();
  }  
}
