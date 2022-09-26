import java.util.Scanner;

public class Survey {
  public static void main(String[] args) {
    
    int counter  = 0;
    Scanner scan = new Scanner(System.in);
    System.out.println("Welcome, thank you for taking the survey");

    System.out.println("\nWhat is your name");
    String name = scan.nextLine();
    counter++;

    System.out.println("\nHow much do you spend on coffee");
    double coffeeSpend = scan.nextInt();
    counter++;

    System.out.println("\nHow much do you spend on fast food");
    double fastfoodSpend = scan.nextDouble();
    counter++;

    System.out.println("\nHow many time in a week do u drink coffee ");
    int coffeeTimes = scan.nextInt();
    counter++;

    System.out.println("\nHow many time in a week do u eat fast food ");
    int fastfoodTimes = scan.nextInt();
    counter++;

    System.out.println("\nThank you " + name + " for answering all " + counter + " of questions");
    System.out.println("Your fast food expense are " + ((fastfoodSpend*fastfoodTimes)/(coffeeSpend*coffeeTimes)) + " your coffee expenses");
    System.out.println("weekly you spend " + (coffeeSpend*coffeeTimes) +" on coffee");
    System.out.println("weekly you spend " + (fastfoodSpend*fastfoodTimes) +" on fast food");

    scan.close();
  }   
}
