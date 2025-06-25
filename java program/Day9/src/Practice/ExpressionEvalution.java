package Practice;
import java.util.*;

public class ExpressionEvalution {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the age");
		int age=s.nextInt();
		
		if(age>=60 ||  age<=12)
		{
			System.out.println("the person is senior citizen or child");
		}
		System.out.println("the person neither is senior citizen or nor child");
		

	}

}
