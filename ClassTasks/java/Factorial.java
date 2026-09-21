import java.util.Scanner;
public class Factorial {
    public static void main (String []args){
    
    Scanner scanner = new Scanner(System.in);
    
    System.out.println("Enter a interger: ");
    int number = scanner.nextInt();
    
    long factorial = 1;
    
    for(; number >= 1; number--){
        factorial *= number;
    }
    System.out.println(factorial);
    }
}
