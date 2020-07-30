package programming_class;
import java.util.Scanner;
public class ld_even_odd {

	public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
    System.out.println("Enter the number");
    int n=s.nextInt();
    int ld=n%10;;
    if(ld%2==0)
    {
    	System.out.println("LD is even");
    }
    else
    {
    	System.out.println("LD is odd");
    }
	}

}
