package programming_class;
import java.util.Scanner;
public class disarium {
	public static int count(int a)
	{
		int ct=0;
		
		while (a>0) {
			ct++;
			a=a/10;
	
		}
		return ct;
	}

	public static int power(int x,int n)
	{
		int i=1;
		int pwr=1;
		while(i<=n)
			{
			pwr=pwr*x;
			i++;
			}

		  return pwr;
		}
	
	public static void main(String[] args) {
     Scanner s=new Scanner(System.in);
    System.out.println("Enter the number to check");
    int num=s.nextInt();
    int temp=num;
    int count=count(num);
    System.out.println("Total count of numbers are "+count);

    int sum=0;
    
       while(num>0)    
       {
    	    int ld=0;
    	   ld=num%10;
    	   sum=sum+power(ld,count);
    	   num=num/10;
    	   count--;
       }
       if(temp==sum)
       {
    	   System.out.println("The given no is Disarium number");
       }
       else
       {
    	   System.out.println("The given number is non disarium number");
       }
    	   
    	   
	}

}
