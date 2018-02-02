import java.util.Scanner;

public class ScannerSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your age: ");
		int yourAge = sc.nextInt();
		System.out.println("Age: " + yourAge);
		sc.close();
	}

}
