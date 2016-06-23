package easyproblems;

import java.util.Scanner;

public class PalindromeCorrect {
	public static void main (String[]args){
		Scanner sc=new Scanner(System.in);
		String a=sc.next();
		int i=0;
		int j=a.length()-1;
		
	    while(a.charAt(i)==a.charAt(j) && (i++)<=(j--));
	    System.out.println(i>=j?"Yes":"No");
	}

}
