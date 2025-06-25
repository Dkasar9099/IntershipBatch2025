package Practice;
import java.util.*;

import java.util.Scanner;

public class Split {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the string:");
		String input=s.nextLine();
		
		String[] Words=input.split(",");
		System.out.println("Student Details:");
		 
		 for(String word : Words) {
			 System.out.println(word);
	}
	}

}
