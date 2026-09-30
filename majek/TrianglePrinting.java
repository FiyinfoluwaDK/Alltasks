public class TrianglePrinting {
    public static void main(String[] args) {
        int rows = 10;

        // Pattern (a): left-aligned increasing
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print('*');
            }
            System.out.println();
        }
        System.out.println();

        // Pattern (b): left-aligned decreasing
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= rows - i + 1; j++) {
                System.out.print('*');
            }
            System.out.println();
        }
        System.out.println();

        // Pattern (c): right-aligned decreasing
        for (int i = 1; i <= rows; i++) {
            for (int s = 1; s < i; s++) {
                System.out.print(' ');
            }
            for (int j = 1; j <= rows - i + 1; j++) {
                System.out.print('*');
            }
            System.out.println();
        }
        System.out.println();

        // Pattern (d): right-aligned increasing
        for (int i = 1; i <= rows; i++) {
            for (int s = 1; s <= rows - i; s++) {
                System.out.print(' ');
            }
            for (int j = 1; j <= i; j++) {
                System.out.print('*');
            }
            System.out.println();
        }
    }
}
