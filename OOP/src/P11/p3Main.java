package P11;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class p3Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a string: ");
		String input = sc.nextLine();

		Map<Character, Integer> frequency = new LinkedHashMap<>();

		int vowels = 0;
		int consonants = 0;
		int digits = 0;
		int spaces = 0;

		for (char ch : input.toCharArray()) {
			frequency.put(ch, frequency.getOrDefault(ch, 0) + 1);

			if (Character.isDigit(ch)) {
				digits++;
			} else if (Character.isWhitespace(ch)) {
				spaces++;
			} else if (Character.isLetter(ch)) {
				if ("aeiouAEIOU".indexOf(ch) != -1) {
					vowels++;
				} else {
					consonants++;
				}
			}
		}

		System.out.println("Character Frequencies:");

		for (Map.Entry<Character, Integer> entry : frequency.entrySet()) {
			if (entry.getKey() == ' ') {
				System.out.println("[space] = " + entry.getValue());
			} else {
				System.out.println(entry.getKey() + " = " + entry.getValue());
			}
		}

		System.out.println("Vowels: " + vowels);
		System.out.println("Consonants: " + consonants);
		System.out.println("Digits: " + digits);
		System.out.println("Spaces: " + spaces);

		sc.close();
	}
}