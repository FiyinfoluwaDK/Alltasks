import java.util.Scanner;

public class ModifiedDiamondPrinting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rows;

        do {
            System.out.print("Enter an odd number between 1 and 19: ");
            rows = scanner.nextInt();
        } while (rows < 1 || rows > 19 || rows % 2 == 0);

        int mid = rows / 2 + 1;

        for (int i = 1; i <= mid; i++) {
            printSpaces(mid - i);
            printStars(2 * i - 1);
            System.out.println();
        }

        for (int i = mid - 1; i >= 1; i--) {
            printSpaces(mid - i);
            printStars(2 * i - 1);
            System.out.println();
        }
    }

    public static void printStars(int count) {
        for (int j = 0; j < count; j++) System.out.print('*');
    }

    public static void printSpaces(int count) {
        for (int j = 0; j < count; j++) System.out.print(' ');
    }
}
