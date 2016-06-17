package easyproblems;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
    	System.out.println("Input the string");
    	Scanner sc=new Scanner(System.in);
    	String A=sc.next();
    	System.out.println("Input the required length of the sub-string");
    	int k=sc.nextInt();
    	
    	System.out.println(Arrays.toString(
    		  (A).split("(?<=\\G.{3})")
    		));
    }
}