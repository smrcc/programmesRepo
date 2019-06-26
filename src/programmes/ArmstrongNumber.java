package programmes;

public class ArmstrongNumber {

	public static void main(String[] args) 
	{
		int num=153;
		int r;
		int cube=0;
		int t=num;
		while(num>0)
		{
			r=num%10;
			num=num/10;
			cube=cube+r*r*r;
		}
		if(t==cube)
		{
			System.out.println(" given number is arm strong number ");
		}
		else
		{
			System.out.println("not arm strong number");
		}
		
	}
	
	}

