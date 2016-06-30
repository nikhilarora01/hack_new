package easyproblems;

import java.util.Scanner;

public class AnagramBest {
	public static void main (String[]args){
		char z[]="abcdefghijklmnopqrstuvwxyz".toCharArray();
		Scanner sc=new Scanner(System.in);
		String a=sc.next();
		String b=sc.next();
		for (int i=0; i<=z.length; i++){
			if (a.toCharArray().equals(z) && (b.toCharArray().equals(b))){
				System.out.println("Anagram");
				
			}
			else System.out.println("Not Anagram");
		}
	}

}
