package easyproblems;

import java.util.Scanner;

public class Mat {
	
	public static void main(String[]args){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of rows and columns");
		int row=sc.nextInt();
		int col=sc.nextInt();
        int[][] mat = new int[row][col];
        System.out.println("Enter" +" "+ row*col+" " +"elements"); 
        for(int i = 0; i < col; i++) 
        { 
                for(int j = 0; j < row; j++)  
                { 
                        mat[i][j] = sc.nextInt(); 
                        System.out.print(mat[i][j] + " "); 
                } 
                System.out.println();
        } 
        
      /*for(int i = 0; i < mat.length; i++) 
        { 
                for(int j = 0; j < mat.length; j++) 
                { 
                        System.out.print(mat[i][j] + " "); 
                } 
                System.out.println(); 
        }*/
	}
}
