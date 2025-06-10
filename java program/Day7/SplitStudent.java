package ExpressionL;
import java.util.*;

public class SplitStudent {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the string:");
		String input=s.nextLine();
		
		String[] details=input.split(",");
		System.out.println("Student Details:");
		 
		 for(String detail : details) {
			 System.out.println(detail);
		 }
	}

}
