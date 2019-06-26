package programmes;

public class StringRev1 {

	public static void main(String[] args) 
	{
		String s="appala mahesh babu";
		String r=" ";
		String r1=" ";
	String str[]=	s.split(" ");
	for(int i=0;i<str.length;i++)
	{
		r=str[i];
		
		for(int j=r.length()-1;j>=0;j--)
		{
			r1=r1+r.charAt(j);
		}
		
	}
	System.out.println( r1 + " ");

	}

}
