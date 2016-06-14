package easyproblems;
import java.math.*;
import java.util.*;

public class SBlock{
	static Scanner dimensions=new Scanner(System.in);
	static boolean flag=true;
	static int B=dimensions.nextInt();
	static int H=dimensions.nextInt();
	
	static{
		if(B<=0 || H<=0)
		{
			flag=false;
			System.out.println("java.lang.Exception: Breadth and height must be positive");
		}
		else {
			flag=true;		
			
		}
	}
	
	
	public static void main(String[] args){		
		if(flag){
			int area=B*H;
			System.out.print(area);
		}
		
	}
}
