// Bmi calculator (body mass index calculator)
import java.util.Scanner; // We will use class Scanner

public class Bmi
{

// main method begins execution of Java application
	public static void main(String[] args)
	{
// create a Scanner to obtain input from the command window
		Scanner input = new Scanner(System.in);

		int weightInPounds;
		int heightInInches;

		System.out.print("What is you weight in pounds: "); // prompt user to enter weight
		weightInPounds = input.nextInt();

		System.out.print("What is your height in inches: "); // prompt user to enter height
		heightInInches = input.nextInt();
		
		weightInPounds = weightInPounds * 703;

		heightInInches = heightInInches * heightInInches;

		int bodyMassIndex;

		bodyMassIndex = weightInPounds / heightInInches;

		if (bodyMassIndex < 18.5)
 			{System.out.printf("Under weight");}
	
		else if (bodyMassIndex > 18.5 &&  bodyMassIndex < 24.9)
 			{System.out.printf("Normal");}

		else if (bodyMassIndex > 25 && bodyMassIndex < 29)
 			{System.out.printf("Over weight");}

		else if (bodyMassIndex >= 30)
			{System.out.printf("Obese");}

		else {System.out.printf("Undetermined");}
	 }
}