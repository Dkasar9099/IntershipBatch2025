package Even;
import java.util.*;

public class EvenEx {
	
	public void EvenNumber()
	{
		int n;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the N number:");
		n=s.nextInt();
		for(int i=1;i<=n;i++)
		{
			if(i%2==0)
			{
				System.out.println(i);
			}
		}
		
	}

	public static void main(String[] args) {
		EvenEx E=new EvenEx();
		E.EvenNumber();
		
	}

}
