package SwitchCase;

import java.util.Scanner;

public class VowelConstant {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Character:");
		char ch =s.next().toLowerCase().charAt(0);
		
		switch(ch)
		{
		case 'a':
		case 'i':
		case 'o':
		case 'u':
		case 'e':
		
		System.out.println("Vowel");
		break;
			
		default:
		{
			if(ch>='a' && ch<= 'z')
			{
				System.out.println("Constant");
			}
			else
			{
				System.out.println("Invalid Alphabet");
			}
		}
			
		
		}
		
	}

}
