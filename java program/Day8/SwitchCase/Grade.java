package SwitchCase;
import java.util.*;

public class Grade {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Grade");
		char Grade =s.next().toUpperCase().charAt(0);
		
		switch(Grade)
		{
		case 'A':
			System.out.println("A:Exellent");
			break;
			
		case 'B':
			System.out.println("B:Good");
			break;
			
		case 'C':
			System.out.println("C:Average");
			break;
			
		case 'D':
			System.out.println("C:Below Average");
			break;
			
		case 'F':
			System.out.println("F:fail");
			break;
		}
		
	}

}
