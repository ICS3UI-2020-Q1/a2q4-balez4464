import java.util.Scanner;
/**
 *This program tells the user their discount and how much they saved based on how much they spent
 * @author Zachary Balean 
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // Creates new Scanner
    Scanner input = new Scanner(System.in);

    //Constants for the discount percents
    final double TEN_OFF = 0.10;
    final double TWENTY_OFF = 0.20;
    final double THIRTY_OFF = 0.30;
    final double FORTY_OFF = 0.40;

    //asks and allows user to input how much they spent
    System.out.println("Please enter the amount the customer spent");
    double amountSpent = input.nextDouble();

    //Calculates cost if you get 10% off
    if(amountSpent >= 0.01 && amountSpent <= 40.00){
      System.out.println("They will receive 10% off.");
      //Calculates amount saved
      double amountSaved = (amountSpent * TEN_OFF);
      System.out.println("They will save $" + amountSaved);
      //Calculates remaining total
      double total = (amountSpent - amountSaved);
      System.out.println("The new total is $" + total);
      
      //Calculates cost if you get 20% off
    } else if(amountSpent >= 40.01 && amountSpent <= 80.00){
      System.out.println("They will receive 20% off.");
      double amountSaved = (amountSpent * TWENTY_OFF);
      System.out.println("They will save $" + amountSaved);
      double total = (amountSpent - amountSaved);
      System.out.println("The new total is $" + total);

      //Calculates if you get 30% off
    } else if(amountSpent >= 80.01 && amountSpent <= 120.00){
      System.out.println("They will receive 30% off.");
      double amountSaved = (amountSpent * THIRTY_OFF);
      System.out.println("They will save $" + amountSaved);
      double total = (amountSpent - amountSaved);
      System.out.println("The new total is $" + total);

      //Calculates if you get 40%off
    } else {
      System.out.println("They will receive 40% off.");
      double amountSaved = (amountSpent * FORTY_OFF);
      System.out.println("They will save $" + amountSaved);
      double total = (amountSpent - amountSaved);
      System.out.println("The new total is $" + total);
    }


  }
}
