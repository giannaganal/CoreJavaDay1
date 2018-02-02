
public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//declaration and initialization of values
		int firstNum = 20;
		int secondNum = 15;
		
		// perform operations
		int sum = firstNum + secondNum;
		int product = firstNum * secondNum;
		int difference = firstNum - secondNum;
		double quotient = (double) firstNum / (double) secondNum;
		int modulo = firstNum % secondNum;
		
		// display
		System.out.println( firstNum + " + " + secondNum + " = " + sum);
		System.out.println( firstNum + " * " + secondNum + " = " + product);
		System.out.println( firstNum + " - " + secondNum + " = " + difference);
		System.out.println( firstNum + " / " + secondNum + " = " + String.format("%.2f", quotient));
		System.out.println( firstNum + " % " + secondNum + " = " + modulo);
		
	}

}
