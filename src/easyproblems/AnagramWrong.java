package easyproblems;

import java.util.Scanner;

public class AnagramWrong {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		String b = sc.next();
		int al[] = new int[26];
		for (int i = 0; i < al.length; i++) {
			
			char[] c = (a.toLowerCase().toCharArray());
			char[] d = b.toLowerCase().toCharArray();
			for (int j = 0; j < c.length; j++) {
				if (c.equals(al[i])) {
					i++;
				}
				for (int k=0; k<d.length;k++){
					if(d.equals(al[i])){
						i--;
					}
				}
				
			}
			
}
		if(i!=0)
			
		{
			System.out.println("Not Anagram");
		}
		
		else System.out.println("Yes");


	}
}
