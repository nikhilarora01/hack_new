package easyproblems;

import java.util.Scanner;

public class PalindromeCorrect {
	public static void main (String[]args){
		Scanner sc=new Scanner(System.in);
		String a=sc.next();
		int i=0;
		int j=a.length()-1;
		
	    while((i)<=(j) && a.charAt(i++)==a.charAt(j--));
	    System.out.println(i>=j?"Yes":"No");
	}

}
