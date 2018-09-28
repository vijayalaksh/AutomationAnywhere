package Project1;

public class StringReverse {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		ReverseString();
	}
	
	public static void ReverseString()
	{
		String s="This is my office";
		String[] test = s.split(" ");
		
		String snew="";
		for (int i = test.length-1; i >= 0; i--) 
		{
			snew = snew +test[i] +" " ;
		}
		System.out.println(snew);
 	}

}
