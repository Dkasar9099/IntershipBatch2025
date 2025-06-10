package ExpressionL;
import java.util.*;

public class SplitWord {

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
