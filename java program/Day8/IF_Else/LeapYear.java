package IF_Else;
import java.util.*;

public class LeapYear {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the year");
		int year=s.nextInt();
		
		if(year%4==0)
		{
			System.out.println("Leap year");
		}
		else
		{
			System.out.println("Not Leap year");
		}

	}

}
