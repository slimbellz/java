import java.util.Scanner;

public class Arithmetic
{
	public static void main (String[] args)
	{
		Scanner input = new Scanner(System.in);

		int firstNumber;
		int secondNumber;
		int sum;
		int product;
		int div;

		System.out.print("Type in first number: ");
		firstNumber = input.nextInt();
		System.out.print("Type in second number: ");
		secondNumber = input.nextInt();

		sum = firstNumber + secondNumber;

		product = firstNumber * secondNumber;

		div = firstNumber / secondNumber;

		System.out.printf("Sum is %d%n", sum);
		System.out.printf("product is %d%n", product);
		System.out.printf("div is %d%n", div);
	}
} //End