public class WorkbookTwoPointFour {
  public static void main(String[] args) {
    double sales = 24_309.65;
    double profit = 18_562.18;
    double refunds = 688.78;
    double shippingCost = 1233.57;

    System.out.println("This month, we made $" + (int)sales + " in sales");
    System.out.println("Factoring in costs, we made $" + profit + " in profit");
    System.out.println("The refunds are at a low $" + refunds + ". This is a good sign!");
    System.out.println("Shipping costs were high. We paid $" + shippingCost + " in shipping");

  }  
}

// This month, we made $24309 in sales
// Factoring in costs, we made $18562 in profit
// The refunds are at a low $688. This is a good sign!
// Shipping costs were high. We paid $1233 in shipping
