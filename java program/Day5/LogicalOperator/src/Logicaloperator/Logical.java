package Logicaloperator;
import java.util.*;

public class Logical {

	public static void main(String[] args) 
	{
	   int Mark;
	   Scanner s=new Scanner(System.in);
	   System.out.println("Enter the Marks:");
	   Mark=s.nextInt();
	   
	   if(Mark>=35)
	   {
		   System.out.println("PASS....!!");
	   }
	   else
	   {
		   System.out.println("FAIL....!!");
	   }
	   

	}

}
