import java.util.Scanner;

public class Lab5 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		boolean keepGoing;
		
		do {
			
			System.out.println("Please enter an integer from 1 to 17.");
			int input = scan.nextInt();
			scan.nextLine();
			
			
			if (input > 0 && input < 17) {
				
				int factorial = findFactorial(input);
				System.out.println(input + " factorial is " + factorial);
			}
			else {
				System.out.println("Invalid input. Be sure that your number is between 1 and 10.");
			}
			
			System.out.println("Would you like to continue? (y/n)");
			if (scan.nextLine().equalsIgnoreCase("y")) {
				keepGoing = true;
			}
			else {
				keepGoing = false;
			}
			
		} while (keepGoing);
	}
	
	public static int findFactorial(int num) {
		int factorial = 1;
		for(int i = 1; i <= num; i++) {
			factorial *= i;
		}
		return factorial;
	}
}
