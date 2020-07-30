package programming_class;
import java.util.Scanner;
public class strong {

	public static void main(String[] args) {
     Scanner s=new Scanner(System.in);
     System.out.println("Enter the number to check");
     int num=s.nextInt();
     int temp=num;
     int ld;
     int sum=0;
     while (num>0) {
		ld=num%10;
		sum=sum+factorial(ld);
		num=num/10;
	}
     if(temp==sum)
     {
    	 System.out.println("The number is a strong number");
     }
     else
     {
    	 System.out.println("Not a strong Number...Apparantly weak one..!");
     }
	}
	
	public static int factorial(int a)
	{
		int fact=1;
		while(a>0)
		{
			fact=fact*a;
					a--;
		}
		
		return fact;
	}

}
