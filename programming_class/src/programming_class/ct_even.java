package programming_class;

public class ct_even {
	public static int countEven( int n)
	{
		int ct=0;
		int ld=0;
		while (n>0) {
			ld=n%10;
			if(ld%2==0)
			{
				ct++;
			}
			n=n/10;
		}
		return ct;
	}
	public static void main(String[] args) {
		int ct=countEven(45622);
		System.out.println("The count of even digit in given number is "+ct);
	}

}
