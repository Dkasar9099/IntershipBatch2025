package SwitchCase;
import java .util.*;

public class HomeWork {

	public static void main(String[] args) {
		  Scanner sc = new Scanner(System.in);

	        System.out.print("Enter currency code (INR, USD, EUR, GBP): ");
	        String currency = sc.next().toUpperCase();

	        switch (currency) {
	            case "INR":
	                System.out.println("Currency Symbol: ₹");
	                break;
	            case "USD":
	                System.out.println("Currency Symbol: $");
	                break;
	            case "EUR":
	                System.out.println("Currency Symbol: €");
	                break;
	            case "GBP":
	                System.out.println("Currency Symbol: £");
	                break;
	            default:
	                System.out.println("Invalid currency code.");
	        }



	}

}
