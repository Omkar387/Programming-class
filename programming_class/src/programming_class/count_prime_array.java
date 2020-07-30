package programming_class;
import java.util.Scanner;
public class count_prime_array {

	public static void main(String[] args) {
      Scanner s=new Scanner(System.in);
      System.out.println("Enter the size of an array..!");
      int size=s.nextInt();
      int a[]=new int[size];
      System.out.println("Enter the elements of an array");
      for (int i = 0; i < a.length; i++) {
		a[i]=s.nextInt();	}
      int ct=countArray(a);
      System.out.println("The count of prime numbers present in an array : "+ct);
      
	}
	public static int countArray(int[]a)
	{
		int ct=0;
		for (int i = 0; i < a.length; i++) {
			int count=0;
			int b=2;
			
			while(b<a[i])
			{
				if (a[i]%b==0) {
					count++;
				}
				
			}
			if(count==0)
			{
				ct++;
			}
			
		}
		return ct;
	}

}
