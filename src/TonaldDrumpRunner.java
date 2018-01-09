	import java.util.Scanner;

/**
 * @author Anirudh Emmadi
 */
public class TonaldDrumpRunner
{

	/**
	 * Create a Magpie, give it user input, and print its replies.
	 */
	public static void main(String[] args)
	{
		TonaldDrump maggie = new TonaldDrump();

		System.out.println (maggie.getGreeting());
		Scanner in = new Scanner (System.in);
		String statement = in.nextLine();

		while (!statement.equals("Bye")&& (!statement.equals("bye")) && (!statement.equals("end"))&& (!statement.equals("exit"))
		 && (!statement.equals("End"))&& (!statement.equals("Exit")))
		{
			System.out.println (maggie.getResponse(statement));
			statement = in.nextLine();
		}
	}

}
