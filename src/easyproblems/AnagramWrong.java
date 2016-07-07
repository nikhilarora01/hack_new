package easyproblems;

import java.util.Scanner;

public class AnagramWrong {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		String b = sc.next();
		int al[] = new int[26];
		for (int i = 0; i < al.length; i++) {
			System.out.println(al[i]);
			char[] c = (a.toLowerCase().toCharArray());
			char[] d = b.toLowerCase().toCharArray();
			for (int j = 0; j < c.length; j++) {
				if (c.equals(j) == al.equals(j - i)) {
					i++;
				}
				System.out.println(c[j]);
				
				
			}

		}

	}
}
