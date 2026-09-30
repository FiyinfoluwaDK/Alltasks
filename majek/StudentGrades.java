import java.util.Scanner;

public class StudentGrades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int aCount = 0, bCount = 0, cCount = 0, dCount = 0;

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter student name: ");
            String name = scanner.next();
            System.out.print("Enter grade (A/B/C/D): ");
            String grade = scanner.next().toUpperCase();

            switch (grade) {
                case "A":
                    aCount++;
                    break;
                case "B":
                    bCount++;
                    break;
                case "C":
                    cCount++;
                    break;
                case "D":
                    dCount++;
                    break;
                default:
                    System.out.println("Invalid grade entered");
            }
        }

        System.out.println("\nNumber of A's: " + aCount);
        System.out.println("Number of B's: " + bCount);
        System.out.println("Number of C's: " + cCount);
        System.out.println("Number of D's: " + dCount);
    }
}
