package easyproblems;

import java.util.Scanner;

public class EOF{
	public static void main(String[] args) {
	    /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
	    Scanner scan=new Scanner(System.in);
	    int i=0;
	    String output="";
	    while(scan.hasNextLine()){
	        String input=scan.nextLine();
	        i++;
	        output+=i+" "+input+"\n";
	    }

	    System.out.println(output);
	}
	
}