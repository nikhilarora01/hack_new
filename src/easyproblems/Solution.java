package easyproblems;
import java.io.*;
import java.util.*;

public class Solution {
    public static void main (String[]args){
        Scanner sc=new Scanner(System.in);
        String a=sc.next();
        String b=sc.next();
        if (a.length()==b.length() && a.equals(b))
            return true;
        System.out.println("Yes");
        
        	return false;
        
    }
    
}

