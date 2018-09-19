package inclass;

/** This class performs string mutations.
 *  Please see the discussion in the texbook for more details. You should notice
 *  that the source code from the textbook has been modified so as to ensure
 *  that it adheres to the programming style guide established by Google.
 *
 * <p>Bugs: This program has no known bugs.
 *
 * @author Lewis and Loftus
 */

public class PerformStringMutation {

  /** The main entry point for StringMutation.
   *  The source code inside of this method will be executed when the program is
   *  run in the command-line. The output of this program will appear in the
   *  terminal window. The println statements make the program display output
   *  about the manipulation of String variables.
   *
   * @param args The command-line arguments
   **/
  public static void main(String[] args) {
    String phrase = "Change is inevitable";

    System.out.println("Original string: \"" + phrase + "\"");
    System.out.println("Length of string: " + phrase.length());

    String mutation1;
    String mutation2;
    String mutation3;
    mutation1 = phrase.concat(", except from vending machines.");
    mutation2 = mutation1.toUpperCase();
    mutation3 = mutation2.replace('E', 'X');

    String mutation4 = null;
    // TODO: see the textbook for code to correctly assign mutation4

    // Print each mutated string
    System.out.println("Mutation #1: " + mutation1);
    System.out.println("Mutation #2: " + mutation2);
    System.out.println("Mutation #3: " + mutation3);
    System.out.println("Mutation #4: " + mutation4);

    // Display the length of a mutation string
    // TODO: add the line of source code to output mutation4
  }
}
