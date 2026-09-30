public class DiamondPrinting {
    public static void main(String[] args) {
        int rows = 9;
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
