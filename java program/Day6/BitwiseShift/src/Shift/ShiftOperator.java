package Shift;
import java.util.*;

public class ShiftOperator {

	public static void main(String[] args) {
		System.out.println("Enter number:");
	 Scanner s=new Scanner(System.in);
	 int a=s.nextInt();
	 
	 int c=a>>2;
	 System.out.println("Right Shift:"+c);
	 
	 int d=a<<2;
	 System.out.println("Left Shift:"+d);
	 
	 int e=a>>>2;
	 System.out.println("Unsigned Right Shift:"+e);
	 
	}

}
