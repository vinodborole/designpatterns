package geeks.in.action;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

/**
 * This is main class that test Factory implementation for Fives games available
 * on Android. Basic idea of game is to pop up different digits ranging from 2,
 * 3, 5 or 5 with multiplier with value of 2^n (10, 20, 40, 80, 160, etc)
 * 
 * Program might be an overkill to show case Factory pattern but idea is to
 * create Digits in factory implementation with above rules.
 * 
 * @see Readme.txt more for details
 * 
 * @author manishdevraj
 * 
 */
public class FiveFactoryMainTest {

	public static void main(String[] args) throws InterruptedException {
		// Factory object
		FiveFactory fiveFactory = new FiveFactory();
		// Collection to store our digits
		List<Digit> digitArray = new ArrayList<Digit>();

		Random random = new Random();
		System.out
				.println("Enter Key to add more digits OR Q to exit and merge!!!");
		Scanner input = new Scanner(System.in);
		Digit digit;
		// Lets randomly create digits now
		do {
			int randomInd = random.nextInt(5);
			if (randomInd == 2 || randomInd == 3) {
				digit = fiveFactory.makeDigits(randomInd, 1);
			} else {
				if (randomInd == 0)
					randomInd = 2;
				digit = fiveFactory.makeDigits(5, randomInd);
			}
			System.out.println("Digit created : " + digit.getValue());
			digitArray.add(digit);

		} while (input.nextLine().equalsIgnoreCase(""));

		// Using Factory object let's try to merge digit and create new one
		int len = digitArray.size() - 1;
		for (int i = 0, j = len; i <= len / 2 && j >= len / 2; i++, j--) {
			Digit d1 = digitArray.get(i);
			Digit d2 = digitArray.get(j);
			digit = fiveFactory.mergeDigits(d1, d2);
			if (digit != null) {
				System.out.println(d1.getValue() + " and " + d2.getValue()
						+ " Digits mereged : " + digit.getValue());
			} else {
				System.out.println("Cannot merge " + d1.getValue() + " and "
						+ d2.getValue());
			}
		}
	}
}
