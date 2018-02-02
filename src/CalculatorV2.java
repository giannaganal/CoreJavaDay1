import java.util.Scanner;

public class CalculatorV2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// declaration
		Scanner myScanner;
		int firstNum;
		int secondNum;
		
		// create Scanner object
		myScanner = new Scanner(System.in);
		
		// user provided values for initialization
		System.out.println("Provide two whole numbers that will be used for mathematical operations.");
		
		System.out.println("Enter operand 1: ");
		firstNum = myScanner.nextInt();
		
		System.out.println("Enter operand 2: ");
		secondNum = myScanner.nextInt();
		
		System.out.println();
		System.out.println("Performing operations...");
		
		// perform operations
		int sum = firstNum + secondNum;
		int product = firstNum * secondNum;
		int difference = firstNum - secondNum;
		double quotient = (double) firstNum / (double) secondNum;
		int modulo = firstNum % secondNum;
		
		// display
		System.out.println();
		System.out.println( firstNum + " + " + secondNum + " = " + sum);
		System.out.println( firstNum + " * " + secondNum + " = " + product);
		System.out.println( firstNum + " - " + secondNum + " = " + difference);
		System.out.println( firstNum + " / " + secondNum + " = " + String.format("%.2f", quotient));
		System.out.println( firstNum + " % " + secondNum + " = " + modulo);
		
		myScanner.close();
	}

}
