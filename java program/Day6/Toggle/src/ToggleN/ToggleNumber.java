package ToggleN;
import java.util.*;

public class ToggleNumber {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Number:");
		int num=s.nextInt();
		
		int toggled=num^1;
		
		System.out.println("Original Number:"+num);
		System.out.println("Number after toggling last bit:"+toggled);
		

	}

}
