package inclass;

import java.util.Scanner;

/**
 * This class has a method that accepts numerical user input and then calculates
 * and displays the multiples of that numerical value.
 *
 * <p>Bugs: This program has no known bugs.
 *
 * @author Lewis and Loftus
 */
public class ComputeMultiples {

  /** Configure the number of outputs per line. */
  private static final int PER_LINE = 5;

  /**
   * Read in a numerical value and complete the multiples of it.
   * Read the documentation in the README to learn about this program.
   * From your "home base", you can run this program with:
   * gradle -q --console plain runComputeMultiples
   */
  public static void main(String[] args) {
    int value;
    int count = 0;

    Scanner scan = new Scanner(System.in);
    System.out.print("Enter a positive value: ");
    value = scan.nextInt();

    int limit;
    System.out.print("Enter an upper limit: ");
    limit = scan.nextInt();

    System.out.println();
    System.out.println("The multiples of " + value + " between "
                       + value + " and " + limit + " (inclusive) are:");

    int mult;
    for (mult = value; mult <= limit; mult += value) {
      System.out.print(mult + "\t");

      count++;
      if (count % PER_LINE == 0) {
        System.out.println();
      }
    }
  }
}

// Provide a single line comments block that showcases the output from running this program
// See page 268 in the textbook for an example of inputs for running this program
