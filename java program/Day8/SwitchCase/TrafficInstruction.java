package SwitchCase;

import java.util.Scanner;

public class TrafficInstruction {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Colour:");
		 String colour =s.next();
		 
		 switch(colour)
		 {
		 case "Red":
			 System.out.println("Stop");
			 break;
		 case "Yellow":
			 System.out.println("Wail");
			 break;
		 case "Green":
			 System.out.println("Go");
			 break;
		 
			 default:
				 System.out.println("Invalid Colour");
		 }		 
				 
		
	}

}
