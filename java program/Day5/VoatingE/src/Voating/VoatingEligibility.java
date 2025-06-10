package Voating;
import java.util.*;

public class VoatingEligibility {

	public static void main(String[] args) {
		   Scanner sc = new Scanner(System.in);

	        System.out.print("Enter your age: ");
	        int age = sc.nextInt();

	        if (age >= 18 && age <= 120) {
	            System.out.println("You are eligible to vote.");
	        } 
	        else if (age < 18 && age >= 0) {
	            System.out.println("You are not eligible to vote.");
	        } 
	}

}
