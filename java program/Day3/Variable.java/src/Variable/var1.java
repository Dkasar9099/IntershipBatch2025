
package Variable;
public class var1 {
	
		int num=10;
		public static int a=13;
		
		public void show()
		{
			float f1=12.5f;
			System.out.println("Instance variable:"+num);
			System.out.println("Static variable:"+a);
			System.out.println("Local variable:"+f1);
		}

public static void main(String args[])
{
	var1 v1=new var1();
	v1.show();
}
}

		

