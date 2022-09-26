public class Bus {
  public static void main(String[] args){

    String sentence = "Number of passengers: ";
    int passengers = 0;
    passengers += 9;
    System.out.println(sentence + passengers);

    passengers -= 5;
    System.out.println(sentence + passengers);

    passengers -= passengers;
    System.out.println(sentence + passengers);

    sentence = "We have no more passengers";
    System.out.println(sentence);
  }  
}
