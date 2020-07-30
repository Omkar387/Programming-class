package programming_class;
import java.util.Scanner;
public class sum_squars {

	public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
    System.out.println("Enter the number");
    int num=s.nextInt();
    int sum=sumSquare(num);
    System.out.println("The sum of square of digits are "+sum);
    
	}
	public static int sumSquare(int n)
	{
		int ld=0;
		int sum=0;
		while (n>0)
		{
			ld=n%10;
			sum=sum+(ld*ld);
			n=n/10;
			
		}
		return sum;
	}

}
