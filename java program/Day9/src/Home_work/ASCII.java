package Home_work;
import java.util.*;

public class ASCII {

	public static void main(String[] args) {
		  Scanner sc = new Scanner(System.in);
	        System.out.print("Enter a character: ");
	        char ch = sc.next().charAt(0);
	        int ascii = (int) ch; // Type casting char to int
	        System.out.println("ASCII value of '" + ch + "' is " + ascii);
	}

}
