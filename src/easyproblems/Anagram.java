package easyproblems;

import java.util.*;

public class Anagram {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		String b = sc.next();
		while (a.length() != b.length())
			break;
		
		for (int i = 0; i <= a.length(); i++)
			for (int j = 0; j <= b.length(); j++) {
				if (a.equalsIgnoreCase(b))

					System.out.println("Anagram");
				else

					System.out.println("No");

			}
	}
}