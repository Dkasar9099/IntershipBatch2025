package ExpressionL;
import java.util.*;

public class LogicalExpression {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter he value a:");
		int a=s.nextInt();
		System.out.println("Enter he value b:");
		int b=s.nextInt();
		System.out.println("Enter he value c:");
		int c=s.nextInt();
		System.out.println("Enter he value d:");
		int d=s.nextInt();
		
		int res=(a+b)*(c-d);
		System.out.println("Result:"+res);

	}

}
