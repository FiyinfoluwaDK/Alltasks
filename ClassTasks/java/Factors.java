import java.util.Scanner;
public class Factors {
    public static void main (String []args){

    Scanner scanner = new Scanner(System.in);
    
        System.out.println("Enter an integer: ");
        int number = scanner.nextInt();
        
        
        
        for (int counter = 2; counter <= number; ){
            if(number % counter == 0){
                number = number / counter;
                System.out.println(counter);
                }
            else if(number % counter != 0){
                counter++;}
            }
        }
        
    }

