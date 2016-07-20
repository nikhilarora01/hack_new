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
        for(int cinput = 0; cinput < mat.length; cinput++) //column 
        { 
                for(int rinput = 0; rinput < mat.length; rinput++) //row 
                { 
                        mat[cinput][rinput] = sc.nextInt(); //This will read the line of integers and fill all 9 positions in the array. 
                } 
        } 
        
        for(int column = 0; column < mat.length; column++) 
        { 
                for(int arow = 0; arow < mat.length; arow++) 
                { 
                        System.out.print(mat[column][arow] + " "); //Outputs the array in a 3x3 grid. 
                } 
                System.out.println(); 
        }
	}
}
