package ExpressionL;

import java.util.Scanner;

public class Home2 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the string:");
		String input=s.nextLine();
		
		String[] str1=input.split(" ");
		System.out.println("Student Details:");
		 
		 for(String str : str1) {
			 System.out.println(str);
		 }
	}

}
