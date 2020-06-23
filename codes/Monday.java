// Separating the Digits in an Integer

import java.util.Scanner;

public class Monday {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Please Enter a 5 digit number:");
		int num = scanner.nextInt();

		System.out.print(( num % 100000 ) / 10000 );
		System.out.printf("   %d", ( num % 10000 ) / 1000 );
		System.out.printf("   %d", ( num % 1000 ) / 100 );
		System.out.printf("   %d", ( num % 100 ) / 10 );
		System.out.printf("   %d", ( num % 10 ) / 1 );

	}
}