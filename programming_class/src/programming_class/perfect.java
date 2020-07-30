package programming_class;
import java.util.Scanner;
public class perfect {

	public static void main(String[] args) {
      Scanner s=new Scanner(System.in);
      System.out.println("Enter the number to check is it perfect number or not");
      int num=s.nextInt();
      int i=1;
      int sum=0;
      while (i<num) {
    	  
		if (num%i==0) {
			sum=sum+i;
		
		}
		i++;
	}
      if(num==sum)
      {
    	  System.out.println("The given number is a perfect number");
      }
      else
      {
    	  System.out.println("The given number is a non-perfect number");

      }
      
	}

}
