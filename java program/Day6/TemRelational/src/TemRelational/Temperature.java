package TemRelational;
import java.util.*;

public class Temperature {

	public static void main(String[] args) {
		System.out.println("Enter the temperature:");
		Scanner s=new Scanner(System.in);
		int tem=s.nextInt();
		
		if(tem>35)
		{
			System.out.println("HOT DAY");
		}
		
		else
		{
			System.out.println("NORMAL DAY");

		}
	}

}
