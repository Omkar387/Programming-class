package programming_class;

public class odd_even {
	public static void printOE(int a,int b)
	{
		for(int i=a;i<=b;i++)
		{
			if (i%2==0) {
				System.out.println(i+" is an even number");
				
			}
			else
			{
				System.out.println(i+" is an odd number");
			}
		}
	}

	public static void main(String[] args) {
		printOE(10,20);

	}

}
