package IF_Else;
import java.util.*;

public class HomeWok {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	        
	        System.out.print("Enter a number: ");
	        int number = sc.nextInt();

	        if (number % 5 == 0 && number % 11 == 0) {
	            System.out.println(number + " is divisible by both 5 and 11.");
	        } else {
	            System.out.println(number + " is NOT divisible by both 5 and 11.");
	        }



	}

}
