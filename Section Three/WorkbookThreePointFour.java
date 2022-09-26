public class WorkbookThreePointFour {
  public static void main(String[] args) {
    int temp = 5;
    String forecast = "";

    if (temp <= -1 && temp >= -15) {
      forecast = "The forecast is FREEZING! Stay home!";
    } else if (temp <= 10 && temp >= 0) {
      forecast = "The forecast is Chilly. Wear a coat!";
    } else {
      forecast = "It's warm. Go outside!";
    }

    System.out.println(forecast);
  }  
}
