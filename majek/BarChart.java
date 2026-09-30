import java.util.Scanner;

public class BarChart {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5];

        for (int count = 0; count < 5; count++) {
            System.out.print("Enter number " + (count + 1) + " (1-30): ");
            numbers[count] = scanner.nextInt();
        }

        System.out.println("\nBar chart:");
        for (int count = 0; count < 5; count++) {
            for (int counter = 1; counter <= numbers[count]; counter++) {
                System.out.print('*');
            }
            System.out.println();
        }
    }
}
