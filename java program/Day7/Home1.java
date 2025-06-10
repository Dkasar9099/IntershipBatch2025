package ExpressionL;

import java.util.Scanner;

public class Home1 {

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
		int e=0;
		
		int res=(a+b)*(c-d)/e;
		System.out.println("Result:"+res);


	}

}
