package easyproblems;

import java.util.Scanner;

public class PlindromeString {
	public static void main (String[]args){
		Scanner sc=new Scanner(System.in);
		String a = sc.next();
		String temp = null;
		for (int i=0; i<=a.length()-1;i++)
		{
			temp=a;
		}
		if (temp==a)
		{
			System.out.println("Yes");
		}else
			System.out.println("No");
		
	}

}
