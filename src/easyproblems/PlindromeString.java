package easyproblems;

import java.util.Scanner;

public class PlindromeString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		String temp = null;
		boolean flag = true;
		for (int i = 0; i <= a.length() - 1; i++) {
			if (a.charAt(i) == a.charAt(a.length() - 1 - i))

			{
				continue;
			} else {
				flag = false;
				break;
			}

		}
	    String b = flag ? "Yes" : "No";
	    System.out.println(b);
	}

}
