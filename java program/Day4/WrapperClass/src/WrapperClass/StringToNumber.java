package WrapperClass;

public class StringToNumber {

	public static void main(String[] args)
	{
		String no="1234";
		
		int intval=Integer.parseInt(no);
		double doubleval=Double.parseDouble(no);
		
		System.out.println("Original Number:"+no);
		System.out.println("Convert to Int:"+intval);
		System.out.println("Convert to Double:"+doubleval);
		
	}

}
