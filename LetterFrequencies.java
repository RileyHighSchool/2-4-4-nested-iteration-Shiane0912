/*
 * Activity 2.4.4
 */
import java.util.Scanner;
public class LetterFrequencies
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a phrase");
		String phrase = sc.nextLine(); 
		phrase = phrase.toLowerCase();
		String letters = "abcdefghijklmnopqrstuvwxyz";

		System.out.println("The following shows the letter frequencies for the phrase");

    /* your code here */
	for (int o = 0; o < 26; o++){
		String let = letters.substring(o, o+1);
		int count = 0;
		for (int i = 0; i < phrase.length(); i++){
			String phraseHold = phrase.substring(i,i+1);
			if (let.equals(phraseHold)){
				count++;
			}
		}
		System.out.println(let + " appears " + count + " time(s)");
	}

	}
}
