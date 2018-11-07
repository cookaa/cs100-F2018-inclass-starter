package inclass;

import java.text.DecimalFormat;
import java.util.Scanner;

// TODO: Add the required JavaDoc comment that describes the class

public class ComputeAverage {

  /**
   * Demonstrate the use of the Scanner class to read user input.
   * Read the documentation in the README to learn about this program.
   * From your "home base", you can run this program with:
   * gradle -q --console plain runComputeAverage
   */
  public static void main(String[] args) {
    // TODO: describe this block of code
    int sum = 0;
    int value;
    int count = 0;
    double average;

    // TODO: describe this block of code
    Scanner scan = new Scanner(System.in);

    // TODO: Add comments to all remaining blocks of code
    System.out.print("Enter an integer (0 to quit): ");
    value = scan.nextInt();

    while (value != 0) {
      count++;
      sum += value;
      System.out.println("The sum so far is " + sum);
      System.out.print("Enter an integer (0 to quit): ");
      value = scan.nextInt();
    }

    System.out.println();

    // TODO: Separately describe the if and else blocks
    if (count == 0) {
      System.out.println("No values were entered.");
    } else {
      average = (double)sum / count;
      DecimalFormat fmt = new DecimalFormat("0.###");
      // TODO: Add a line of code to display the formatted average
      System.out.println("The average is " + fmt.format(average));
    }
  }
}
