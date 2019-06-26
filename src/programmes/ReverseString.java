package programmes;

public class ReverseString {

	public static void main(String[] args) 
	{
		String str="mahesh";
		String rev="";
		int l=str.length()-1;
		
		for(int i=l;i>=0;i--)
		{
			rev=rev+str.charAt(i);
		}System.out.println(rev);
		

	}

}
