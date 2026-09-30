public class CombinedTrianglePrinting {
    public static void main(String[] args) {
        int rows = 10;
        int width = 11;

        for (int count = 1; count <= rows; count++) {
            printStars(count);
            printSpaces(width - count);

            printStars(rows - count + 1);
            printSpaces(width - (rows - count + 1));

            printSpaces(count - 1);
            printStars(rows - count + 1);
            printSpaces(width - (count - 1) - (rows - count + 1));

            printSpaces(rows - count);
            printStars(count);

            System.out.println();
        }
    }

    public static void printStars(int count) {
        for (int counter = 0; counter < count; counter++) {
            System.out.print('*');
        }
    }

    public static void printSpaces(int count) {
        for (int counter = 0; counter < count; counter++) {
            System.out.print(' ');
        }
    }
}
