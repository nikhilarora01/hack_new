package easyproblems;

import java.util.*;
import java.lang.*;

public class AnagramPivot {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		String b = sc.next();
		if (a.length() != b.length()) {
			System.out.println("Not Anagrams");
			System.exit(0);
		} else {

			int CounterA = 0;
			int CounterB = 0;
			a = a.toLowerCase();
			b = b.toLowerCase();
			
			for (int j = 0; j < a.length(); j++) {
				char pivot = a.charAt(j);
				for (int i = 0; i < a.length(); i++) {
					if (pivot == a.charAt(i)) {
						CounterA++;
					} else {
						continue;
					}
				}
				for (int k = 0; k < b.length(); k++) {
					if (pivot == b.charAt(k)) {
						CounterB++;
					}else{
						break;
					}
					
				}
				if(CounterA==CounterB){
					System.out.println("Anagrams");
					
				}
				else{
					System.out.println("Not Anagrams");
				}
			}
		}
	}
}