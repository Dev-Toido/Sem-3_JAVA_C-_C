package P11;

import java.util.Scanner;

public class p1Main {
		static void main(String[] args) {
			Scanner sc = new Scanner(System.in);

			System.out.print("Enter a string: ");
			String input = sc.nextLine();

			String reverse = new StringBuilder(input).reverse().toString();

			int words = input.trim().isEmpty() ? 0 : input.trim().split("\\s+").length;
			int vowels = 0;
			int spaces = 0;
			int digits = 0;
			int specialCharacters = 0;

			for (int i = 0; i < input.length(); i++) {
				char ch = input.charAt(i);

				if ("aeiouAEIOU".indexOf(ch) != -1) {
					vowels++;
				} else if (Character.isDigit(ch)) {
					digits++;
				} else if (Character.isWhitespace(ch)) {
					spaces++;
				} else if (!Character.isLetterOrDigit(ch)) {
					specialCharacters++;
				}
			}

			System.out.println("Original String: " + input);
			System.out.println("Length: " + input.length());
			System.out.println("Uppercase: " + input.toUpperCase());
			System.out.println("Lowercase: " + input.toLowerCase());
			System.out.println("Reverse: " + reverse);
			System.out.println("Word Count: " + words);
			System.out.println("Contains \"Java\": " + input.contains("Java"));
			System.out.println("Vowels: " + vowels);
			System.out.println("Spaces: " + spaces);
			System.out.println("Digits: " + digits);
			System.out.println("Special Characters: " + specialCharacters);

			sc.close();
		}
	}
