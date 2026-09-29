import java.util.Scanner;

public class MinMax {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("How many values will you enter? ");
        int totalValues = input.nextInt();

        if (totalValues <= 0) {
            System.out.println("Please enter a positive number of values.");
            return;
        }

        // Read the first value to initialize min and max
        System.out.print("Enter integer 1: ");
        int value = input.nextInt();
        int min = value;
        int max = value;

        // Loop to read the remaining values
        for (int i = 2; i <= totalValues; i++) {
            System.out.print("Enter integer " + i + ": ");
            value = input.nextInt();

            if (value < min) {
                min = value;
            }
            if (value > max) {
                max = value;
            }
        }

        int sumOfExtremes = min + max;

        System.out.println("\nMinimum: " + min);
        System.out.println("Maximum: " + max);
        System.out.println("Sum of extremes: " + sumOfExtremes);

       
    }
}
