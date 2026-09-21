import java.util.Scanner;
public class Factor{
    public static void main(String [] args){
    
    Scanner scanner = new Scanner(System.in);
    
    System.out.println("Enter an integer: ");
    int factor = scanner.nextInt();
    
    for(int count = 1; count <= factor; count++){
        if(factor % count == 0){
            System.out.println(count);
        
        }
    }
    }

}
