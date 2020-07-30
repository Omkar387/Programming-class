package programming_class;
import java.util.Scanner;
public class Armsrong_number {

	public static void main(String[] args) {
    Scanner s=new Scanner (System.in);
    System.out.println("Enter the number..!");
    int num=s.nextInt();
    int temp=num;
    int ct=count(num);
    int sum=0;
   
    while (num>0) {
    	 int ld=0;
    	ld=num%10;
    	sum=sum+power(ld,ct);
    	num=num/10;
		
	}
    if (sum==temp) {
    	System.out.println("The given number is armstrong number..!");
		
	}
    else
    {
    	System.out.println("The given number is not armstrong..!");
    }
	}
	public static int count(int n)
	{
		int ct=0;
		while (n>0) {
			n=n/10;
			ct++;
		
			
		}
		return ct;
	}
	public static int power(int x,int n)
	{
		int i=1;
		int pwr=1;
		while (i<=n) {
			pwr=pwr*i;
			i++;
		}
		return pwr;
	}

}
