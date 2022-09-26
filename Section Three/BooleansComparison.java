public class BooleansComparison {
  public static void main(String[] args) {
    int gradeOne = 96;
    int gradeTwo = 75;

    System.out.println(gradeOne > gradeTwo);
    System.out.println(gradeOne < gradeTwo);

    double sales = 37.55;
    double cost = 20.9;

    System.out.println(sales > cost);
    System.out.println(sales < cost);

    String same = "This is the same";
    String sameTwo = "This is the same";
    String notSame = "Not is the same";

    System.out.println(same.equals(sameTwo));
    System.out.println(!sameTwo.equals(notSame));
    System.out.println(!notSame.equals(same));
    System.out.println(!notSame.equals(notSame));
  }  
}
