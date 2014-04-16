import java.util.Scanner;

public class GuessNumberTwo {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int userNum;
		int RandomNum;

		RandomNumber myRnumber = new RandomNumber();
		RandomNum = myRnumber.GetANumber_between_1_and_10();
		System.out.println("Please guess a number");
		userNum = input.nextInt();
		System.out.printf("The computer number is %d ", RandomNum);
		if (RandomNum == userNum)
		{
			System.out.println(" correct guess");
		}
		else if (RandomNum > userNum) {
			System.out.println("Your number is too low");
		}
		else
		{
			System.out.println("Your number is too High");
		}
	}

}
