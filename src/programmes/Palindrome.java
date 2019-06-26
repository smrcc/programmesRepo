package programmes;

public class Palindrome {

	public static void main(String[] args) 
	{
		int cube=0;
		int num=1213;
		int t=num;
		int r;
		//t=num;
		while(num>0)
		{
			r=num%10;
			num=num/10;
			cube=cube*10+r;
			
		}if(t==cube)
		{
			System.out.println("given number is palindrome number");
		}else
		{
			System.out.println("not palindrome number");
		}
	

	}

}
