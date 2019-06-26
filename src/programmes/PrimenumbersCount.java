package programmes;

public class PrimenumbersCount 
{
	
	public static boolean isprime(int num)
	{
		if(num<1)
		{
			return false;
		}for(int i=2;i<num;i++)
		{
			if(num%i==0)
			{
				return false;
			}
			
		}return true;
	}
public static void getprime(int num)
{
	for(int i=2;i<num;i++)
	{
		if(isprime(i))
		{
			System.out.println(i);
		}
	}
}
	public static void main(String[] args)
	{
		int sum=0;
		isprime(10);
		getprime(100);

	}

}
