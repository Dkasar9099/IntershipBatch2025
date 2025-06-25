package Home_work;

public class Factorial {

	public static void main(String[] args) {
		for(int num=1; num<=5; num++)
		{
			int fact=1;
			for(int i=1; i<=num; i++)
			{
				fact *=i;
			}
			System.out.println("Factorial of "+num+ " is " +fact);
		}
	}

}
