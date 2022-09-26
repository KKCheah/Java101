import java.util.Scanner;

public class Challenge {
    public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      int oracleAge = 400;

      System.out.println("\nHello, what is your name");
      String name = scan.nextLine();

      System.out.println("\nHi " + name + ", I'm Javabot. Where are you from?");
      String place = scan.nextLine();

      System.out.println("\nI hear its a beautiful place at " + place + "! I'm from a place called Oracle \nHow old are you?");
      int age = scan.nextInt();

      System.out.println("\nSo you're " + age + ", cool!, I'm " + oracleAge + " years old");
      System.out.println("This means i am " + (((double)oracleAge/(double)age)) + " times older than you are");
      System.out.println("Enough about me. What's your favourite language? (Just don't say Python)");
      //trap nextLine();
      scan.nextLine();
      String language = scan.nextLine();

      System.out.println("\n" + language + " that's great! Nice chatting with you " + name + ". I have to log off now, see ya! ");

      scan.close();
    }
}
