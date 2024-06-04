import java.util.Scanner;
public class guessnumber {
  public static void guessingNumberGame()
	{
		Scanner sc = new Scanner(System.in);
        int number = 1 + (int)(100* Math.random());
        int K = 5;
        int i, guess;
        System.out.println("A number is selected between 1 to 100.Now guess the number within 5 trials.");
		for (i = 0; i < K; i++) {
            System.out.println("Guess the number:");
               guess = sc.nextInt();
		if (number == guess) {
				System.out.println("Congo!!! You guessed the correct number.");
				break;
			}
		else if (number > guess	&& i != K - 1) {
				System.out.println("The number is greater than " + guess);
			}
		else if (number < guess && i != K - 1) {
				System.out.println("The number is less than " + guess);

			}
		}
        if (i == K) {
			System.out.println("Sorry Yours trails over");

			System.out.println("The number was " + number);
		}
	}
	public static void
	main(String arg[])
	{

		guessingNumberGame();
	}
}