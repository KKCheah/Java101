import java.util.Scanner;

public class WorkbookThreePointOne {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.println("Me: Hi Java, do I have enough change to buy chips?");
    double change = 3.50;
    double chipPrice = 2.50;
    System.out.println("Java: " + (change >= chipPrice) + "\n");

    System.out.println("Me: Hi Java, can the elevator hold everyone?");
    int people = 15;
    int elevatorMax = 12;
    System.out.println("Java: " + (elevatorMax >= people) + "\n");


    System.out.println("Me: Hi Java, will my friend be happy?");
    String friendWant = "PS5";
    String yourGift = "toy car";
    System.out.println("Java: " + (yourGift.equals(friendWant)) + "\n");

    
    System.out.println("Me: Hi Java, can everyone attend my dinner party?");
    System.out.println("How many attending");
    int totalAttendance = scan.nextInt();
    System.out.println("How big is venue space");
    int maxSpace = scan.nextInt();
    System.out.println("Java: " + (maxSpace >= totalAttendance) + "\n");

    System.out.println("Me: Hi Java, will I win the election?");
    int yourVotes = 100;
    int competitorVotes = 9;
    System.out.println("Java: " + (yourVotes > competitorVotes) + "\n");

    scan.close();
  }  
}
