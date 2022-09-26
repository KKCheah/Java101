import java.util.Scanner;

public class WorkbookTwoPointFive {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("What is your first name");
    String firstName = scan.nextLine();

    System.out.println("What is your last name");
    String lastName = scan.nextLine();

    System.out.println("How old are you");
    int age = scan.nextInt();

    System.out.println("Make a username");
    //throwaway nextLine to avoid nextLine() trap from Delimiters
    scan.nextLine();
    String username = scan.nextLine();

    System.out.println("What city do you live in");
    String city = scan.nextLine();

    System.out.println("What country is that city in");
    String country = scan.nextLine();

    System.out.println("\nThank you for joining Javagram");
    System.out.println("\nHere is the information you printed");
    System.out.println("\tFirst Name: " + firstName);
    System.out.println("\tLast Name: " + lastName);
    System.out.println("\tage: " + age);
    System.out.println("\tusername: " + username);
    System.out.println("\tcity: " + city);
    System.out.println("\tcountry: " + country);


    scan.close();
  }  
}
