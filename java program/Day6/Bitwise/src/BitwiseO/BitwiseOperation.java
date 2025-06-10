package BitwiseO;
import java.util.*;

public class BitwiseOperation {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the A:");
		int A=s.nextInt();
		System.out.println("Enter the B:");
		int B=s.nextInt();
		
		int C=A&B;
		System.out.println("bITWISE &(AND): "+C);
		
		int D=A|B;
		System.out.println("bITWISE |(OR): "+D);
		
		int E=A^B;
		System.out.println("bITWISE ^(XOR): "+E);
			
	}

}
