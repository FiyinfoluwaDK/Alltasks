
public class Combination{
	public static void main(String[]args){
	
	
	double answer = combinationOf(5, 3);
	 System.out.println(answer);
	
	}

public static double factorialOf(double number){
	double factorial = 1;
	for(int count = 1; count <= number; count++){
		factorial *= count;
	}
	return factorial;
}

public static double combinationOf(double numberOne, double numberTwo){
	return factorialOf(numberOne)/(factorialOf(numberOne-numberTwo)*factorialOf(numberTwo));	

}


}



