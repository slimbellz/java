import java.util.Scanner;

public class ComparingInt
{
	public static void main (String[] args)
	{

		Scanner input = new Scanner(System.in);

		int number1;
		int number2;
		System.out.print("Enter first integer: ");
		number1 = input.nextInt();

		System.out.print("Enter second integer: ");
		number2 = input.nextInt();

		if (number1 > number2)
			System.out.println("First number is larger");
		if (number2 > number1)
			System.out.println("Second number is larger");
		if (number1 == number2)
			System.out.println("These numbers are equal");
}
}