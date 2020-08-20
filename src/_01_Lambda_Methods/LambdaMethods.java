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
		
		System.out.println();
		
		//2. Call the printCustonMessage method using a lambda so that the String prints backwards.
		printCustomMessage((s) -> {
			for (int i = s.length() - 1; i >= 0; i--) {
				System.out.print(s.charAt(i));
			}
		}, "repeat");
		
		System.out.println();
		
		//3. Call the printCustonMessage method using a lambda so that the String prints with a mix between upper an lower case characters.
		printCustomMessage((s) -> {
			boolean h = false;
			for (int i = 0; i < s.length(); i++) {
				h = rand.nextBoolean();
				
				if (h) {
					System.out.print(s.substring(i, i + 1).toLowerCase());
				} else {
					System.out.print(s.substring(i, i + 1).toUpperCase());
				}
			}
		}, "repeat");
		
		System.out.println();
		
		//4. Call the printCustonMessage method using a lambda so that the String prints with a period in between each character.
		printCustomMessage((s) -> {
			int counter = 0;
			for (int i = 0; i < s.length(); i++) {
				if (counter % 2 == 0) {
					System.out.print(s.charAt(i));
				}
				else if (counter % 2 != 0) {
					System.out.print(".");
					i--;
				}
				counter++;
			}
		}, "repeat");
		
		System.out.println();
		
		//5. Call the printCustonMessage method using a lambda so that the String prints without any vowels.
		printCustomMessage((s) -> {
			for (int i = 0; i < s.length(); i++) {
				if (s.charAt(i) != 'a' && s.charAt(i) != 'e' && s.charAt(i) != 'i' && s.charAt(i) != 'o' && s.charAt(i) != 'u') {
					System.out.print(s.charAt(i));
				}
			}
		}, "repeat");
	
	}
	
	public static void printCustomMessage(SpecialPrinter sp, String value) {
		sp.printSpecial(value);
	}
}
	
