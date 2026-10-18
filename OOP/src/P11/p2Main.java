package P11;

import java.util.Scanner;

public class p2Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a string: ");
		String original = sc.nextLine();

		String reversed = new StringBuilder(original).reverse().toString();

		String normalizedOriginal =
				original.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

		String normalizedReverse =
				reversed.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

		System.out.println("Original: " + original + " Reverse: " + reversed);

		if (normalizedOriginal.equals(normalizedReverse)) {
			System.out.println("Result: Palindrome");
		} else {
			System.out.println("Result: Not a Palindrome");
		}

		sc.close();
	}
}