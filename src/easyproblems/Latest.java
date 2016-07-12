package easyproblems;

import java.util.Scanner;

public class Latest {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String a = sc.next().toLowerCase();
		String b = sc.next().toLowerCase();

		char a1[] = a.toCharArray();
		char b1[] = b.toCharArray();

		if (a.length() != b.length()) {
			System.out.println("Not Anagrams");
			System.exit(0);
		} else {
			//int i;
			int[] alpha = new int[26];
			/* int k = 0; */

			/*for (i = 'a'; i <= 'z'; i++) {
				alpha[i - 'a'] = ((char) i);*/
				/* alpha[i]=((char)i); }*/
			//i = 0;
			for (int j = 0; j < a1.length; j++) {
				alpha[a1[j] - 'a']++;
			}
			for (int n = 0; n < b1.length; n++) {
					alpha[b1[n] - 'a']--;
			}
			
            for(int i=0; i < alpha.length; i++){
            	if(alpha[i] < 0){
            		System.out.println("not anagram");
            		System.exit(0);
            	}
            }
				System.out.println("Anagrams");
		}

	}

}

