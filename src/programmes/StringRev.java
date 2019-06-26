package programmes;

public class StringRev {

	public static void main(String[] args) 
	{
		String str="today weather is very cool ";
		String s=" ";
	int l=	str.length()-1;
	for(int i=l;i>=0;i--)
	{
		s=s+str.charAt(i);
	}System.out.println(s);
		

	}

}
