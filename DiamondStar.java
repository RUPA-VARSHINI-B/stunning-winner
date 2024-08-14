
package pattern;
import java.util.Scanner;

public class DiamondStar {

    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);    
        System.out.println("Enter the number of rows:");
        int rows = sca.nextInt();
        sca.close(); // Close the scanner to prevent resource leaks
        diamondstar(rows);
    }

    public static void diamondstar(int rows) {
        for (int i = 1; i <= 2 * rows - 1; i++) {
            // Calculate the number of stars and spaces
            int stars = i <= rows ? 2 * i - 1 : 2 * (2 * rows - i) - 1;
            int spaces = Math.abs(rows - i);

            // Print leading spaces
            for (int j = 0; j < spaces; j++) {
                System.out.print(" ");
            }

            // Print stars
            for (int k = 0; k < stars; k++) {
                System.out.print("*");
            }

            // Move to the next line
            System.out.println();
        }
    }
}
