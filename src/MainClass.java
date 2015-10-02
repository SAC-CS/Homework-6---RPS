
import java.util.Random;
import java.util.Scanner;

public class MainClass {

	public static void main(String[] args)

	{
		Random myRNG = new Random();
		Scanner myKeyboard = new Scanner(System.in);
		char answer = 'Y';

		do {

			System.out.print("Please enter S for scissors, R for rock, or P for paper: ");
			String myChoice = myKeyboard.next().toUpperCase();

			if ((!(myChoice.equals("R"))) && (!(myChoice.equals("P"))) && (!(myChoice.equals("S")))) {
				System.out.println("Error: Invalid choice.");
				System.out.print("Please enter S for scissors, R for rock, or P for paper: ");
				myChoice = myKeyboard.next();
			}
			else{

				if (myChoice.equals("R")) 
				{
					int cpuChoice = myRNG.nextInt(3);
					if (cpuChoice == 0) {
						System.out.println("I picked rock.");
						System.out.println("The game is a draw.");
					} else if (cpuChoice == 1) {
						System.out.println("I picked paper.");
						System.out.println("You lose!");
					} else if (cpuChoice == 2) {
						System.out.println("I picked scissors.");
						System.out.println("You win!");
					}
				} 
				else if (myChoice.equals("P")) 
				{
					int cpuChoice = myRNG.nextInt(3);
					if (cpuChoice == 0) {
						System.out.println("I picked rock.");
						System.out.println("You win!");
					} else if (cpuChoice == 1) {
						System.out.println("I picked paper.");
						System.out.println("The game is a draw.");
					} else if (cpuChoice == 2) {
						System.out.println("I picked scissors.");
						System.out.println("You lose!");
					}
				} 
				else if (myChoice.equals("S")) 
				{
					int cpuChoice = myRNG.nextInt(3);
					if (cpuChoice == 0) 
					{
						System.out.println("I picked rock.");
						System.out.println("You lose!");
					} 
					else if (cpuChoice == 1) 
					{
						System.out.println("I picked paper.");
						System.out.println("You win!");
					} 
					else if (cpuChoice == 2) 
					{
						System.out.println("I picked scissors.");
						System.out.println("The game is a draw.");
					}
				}

				System.out.println("Do it again?");
				answer = myKeyboard.next().toUpperCase().charAt(0);
			}
		} while (answer != 'N');
		System.out.println("GoodBye!");
	}
}

