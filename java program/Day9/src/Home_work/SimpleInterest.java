package Home_work;
import java.util.*;

public class SimpleInterest {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Principle:");
		int P=s.nextInt();
		
		System.out.println("Enter the Rate:");
		int R=s.nextInt();
		
		System.out.println("Enter the Time:");
		int T=s.nextInt();
		
		int SInterest=(P*R*T)/100;
		System.out.println("Simple Interest:"+SInterest);

	}

}
