public class WorkbookThreePointThree {
  public static void main(String[] args) {
    int gryffindor = 100;
    int ravenclaw = 500;

    if((gryffindor - ravenclaw) >= 300) {
      System.out.println("Gryffindor takes the house cup!");
    } else if ((gryffindor - ravenclaw) >= 0){
      System.out.println("In second place, Gryffindor!");
    } else if ((gryffindor - ravenclaw) >= -100) {
      System.out.println("In third place, Gryffindor!");
    } else { 
      System.out.println("In fourth place, Gryffindor!");
    } 
  }  
}
