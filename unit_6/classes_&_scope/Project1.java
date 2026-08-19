public class Exercise1{
  public static void main (String [] args){
    // It's game night, and everyone needs to bring their own game!
    // Create a simple game using classes and Scanner** input (e.g. blackjack, mancala, tic-tac-toe, memory game, hangman, etc.)
    // Requirements:
        // At least 1 class with:
            // Appropriately limited scope
            // 3 or more attributes
            // 4 or more methods
        // Must be playable from main
    // **Scanner:
        // Scanner is an object that allows us to receive input from a user!
        // We don't normally use it on our robot, which is why you haven't used it until now, but here are the basics.
            // import java.util.Scanner; --> Import the Scanner class
            // public class Main {
            //     public static void main(String[] args) {
            //         Scanner scanner = new Scanner(System.in); --> Create a Scanner object
            //         System.out.print("Prompt"); --> Print whatever you want to prompt the user with
            //         String response = scanner.nextLine(); --> Create a variable to store the user's response
            //         scanner.close(); --> Close the scanner at the end of main
            //     }
            // }
        // Other things to note:
            // You can also receive inputs of different types! For example:
                // int response = scanner.nextInt(); --> integer
                // **scanner.nextInt() can break some stuff if you want to use scanner.nextLine() right after, so always follow it with a blank scanner.nextLine().
                // String response = scanner.next(); --> token/word (String)
                // double response = scanner.nextDouble(); --> double
                // boolean response = scanner.nextBoolean(); --> boolean
  }
}