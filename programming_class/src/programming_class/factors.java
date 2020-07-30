package programming_class;
import java.util.Scanner;
public class factors {

	public static void main(String[] args) {
         Scanner s=new Scanner(System.in);
         System.out.println("Enter the number to find factors");
         int num=s.nextInt();
         int i=2;
         System.out.println("The factors are as following :");
         while(i<=num)
         {
        	 if (num%i==0)
        	 {
        		 System.out.println(i);
        		 i++;
        	 }
         }
	}

}
