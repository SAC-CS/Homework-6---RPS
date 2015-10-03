
import java.util.Random;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class MainClass {

	public static void main(String[] args)

	{
		Random myRNG = new Random();
		Scanner myKeyboard = new Scanner(System.in);
		char answer = 'Y';

		do {
			System.out.print("Please enter S for scissors, R for rock, or P for paper: ");
			String myChoice = myKeyboard.next().toUpperCase();

			if ((!(myChoice.equals("R"))) && (!(myChoice.equals("P"))) && (!(myChoice.equals("S")))) 
			{
				System.out.println("Error: Invalid choice.");
				System.out.print("Please enter S for scissors, R for rock, or P for paper: ");
				myChoice = myKeyboard.next();
			}
			else{

				if (myChoice.equals("R")) 
				{
					int cpuChoice = myRNG.nextInt(3);
					if (cpuChoice == 0) 
					{
						System.out.println("I picked rock.\nThe game is a draw.");
						
					} 
					else if (cpuChoice == 1) 
					{
						System.out.println("I picked paper.\nYou lose!.");
						
					} 
					else if (cpuChoice == 2) 
					{
						System.out.println("I picked scissors.\nYou win!");
					}
				} 
				else if (myChoice.equals("P")) 
				{
					int cpuChoice = myRNG.nextInt(3);
					if (cpuChoice == 0) 
					{
						System.out.println("I picked rock.\nYou win!");
					} 
					else if (cpuChoice == 1) 
					{
						System.out.println("I picked paper.\nThe game is a draw.");
					} 
					else if (cpuChoice == 2)
					{
						System.out.println("I picked scissors.\n.You lose!");
					}
				} 
				else if (myChoice.equals("S")) 
				{
					int cpuChoice = myRNG.nextInt(3);
					if (cpuChoice == 0) 
					{
						System.out.println("I picked rock.\nYou lose!");
					} 
					else if (cpuChoice == 1) 
					{
						System.out.println("I picked paper.\nYou win!");
					} 
					else if (cpuChoice == 2) 
					{
						System.out.println("I picked scissors.\nThe game is a draw.");
					}
				}

				answer = JOptionPane.showInputDialog("Do it again? (Y/N)").toUpperCase().charAt(0);
			}
		} while (answer != 'N');
		System.out.println("GoodBye!");
	}
}


