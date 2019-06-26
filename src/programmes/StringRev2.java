package programmes;

public class StringRev2 {

	public static void main(String[] args) 
	{
		String str="my self mahesh";
	//int l=	str.length()-1;
	String r="";
	String a[]=str.split(" ");
	for(int i=a.length-1;i>=0;i--)
	{
		System.out.println(a[i]  + " ");
	}
	

	}

}
