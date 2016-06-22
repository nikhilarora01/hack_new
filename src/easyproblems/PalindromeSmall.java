package easyproblems;

import java.util.*;

public class Solution {

    public static void main(String[] args) {
    	
    	Scanner sc=new Scanner(System.in);
    	String A=sc.next();
    	
    	int k=sc.nextInt();
    	String max=A.substring(0,k);
    	String min=A.substring(0,k);
    	
    	for(int i=0;i+k<=A.length();i++){
    		if (A.substring(i, i+k).compareTo(min)<0);
    		min=A.substring(i, i+k);
    		if(A.substring(i, i+k).compareTo(max)>0);
    		max=(A.substring(i, i+k));
    		
    	}
    	System.out.println(min);
    	System.out.println(max);
    	
    	}
    	
    	
    			
    }
