package _01_Lambda_Methods;

import java.util.Random;

public class LambdaMethods {
	public static void main(String[] args) {
		Random rand = new Random();
		// 1. Look at the SpecialPrinter function interface.
	
		// Here is an example of calling the printCustomMessage method with a lambda.
		// This prints the passed in String 10 times.
		printCustomMessage((s)->{
			for(int i = 0; i < 10; i++) {
				System.out.println(s);
			}
		}, "repeat");
		
		//2. Call the printCustonMessage method using a lambda so that the String prints backwards.
		printCustomMessage((s) -> {
			for (int i = s.length() - 1; i >= 0; i++) {
				System.out.println(s.charAt(i));
			}
		}, "repeat");
		
		//3. Call the printCustonMessage method using a lambda so that the String prints with a mix between upper an lower case characters.
		printCustomMessage((s) -> {
			boolean h = false;
			for (int i = 0; i < s.length(); i++) {
				h = rand.nextBoolean();
				
				if (h) {
					System.out.println(s.substring(i, i + 1).toLowerCase());
				} else {
					System.out.println(s.substring(i, i + 1).toUpperCase());
				}
			}
		}, "repeat");
		
		//4. Call the printCustonMessage method using a lambda so that the String prints with a period in between each character.
		
		//5. Call the printCustonMessage method using a lambda so that the String prints without any vowels.
	
	}
	
	public static void printCustomMessage(SpecialPrinter sp, String value) {
		sp.printSpecial(value);
	}
}
	
