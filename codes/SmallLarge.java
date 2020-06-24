import java.util.Scanner;

public class SmallLarge
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
	
		int x;
		int y;
		int z;
		int sum;
		int average;
		int product;

		System.out.print("Enter first integer: ");
		x = input.nextInt();

		System.out.print("Enter second integer: ");
		y = input.nextInt();

		System.out.print("Enter third integer: ");
		z = input.nextInt();		

		sum = x + y + z;
		product = x * y * z;
		average = (x + y + z) / 3;

		if (x > y && x > z && y > z)
			System.out.printf("Sum is %d%nProduct is %d%nAverage is %d%nHighest Integer %d%nLowest Integer%d%n", sum, product, average, x, z);

		if (y > x && x >z && y > z)
			System.out.printf("Sum is %d%nProduct is %d%nAverage is %d%nHighest Integer %d%nLowest Integer %d%n", sum, product, average, y, z);


		if (z > y && y > x && z > x)
			System.out.printf("Sum is %d%nProduct is %d%nAverage is %d%nHighest Integer %d%nLowest Integer %d%n", sum, product, average, z, x);

		if (z > x && z > y && x > y)
			System.out.printf("Sum is %d%nProduct is %d%nAverage is %d%nHighest Integer %d%nLowest Integer %d%n", sum, product, average, z, y);

		if (x > z && z > y && x > y)
			System.out.printf("Sum is %d%nProduct is %d%nAverage is %d%nHighest Integer %d%nLowest Integer %d%n", sum, product, average, x, y);

		if (y > z && y > x && z > x)
			System.out.printf("Sum is %d%nProduct is %d%nAverage is %d%nHighest Integer %d%nLowest Integer %d%n", sum, product, average, y, x);

}
}
