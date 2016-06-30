package easyproblems;

import java.util.Arrays;
import java.util.Scanner;

public class Solution{
	public static void main (String [] args){
		Scanner sc=new Scanner(System.in);
		String a=sc.next();
		String b=sc.next();
		/*if ((a!=null && b!=null)){
			System.out.println("Not Anagrams");
			System.exit(0);
		}*/
		char A[]=a.toLowerCase().toCharArray();
		char B[]=b.toLowerCase().toCharArray();
		Arrays.sort(A);
		Arrays.sort(B);
		
		if (a.length()==b.length() && Arrays.equals(A, B)){
			System.out.println("Anagrams");
		}
		else
		{
			System.out.println("Not Anagrams");
		}
	}
}