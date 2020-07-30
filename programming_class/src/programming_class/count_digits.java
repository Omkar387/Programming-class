package programming_class;
import java.util.Scanner;
public class count_digits {

	public static void main(String[] args) {
     Scanner s=new Scanner(System.in);
     System.out.println("Enter the number");
     int n=s.nextInt();
     int ct=count(n);
     System.out.println("The count of digits in given number are "+ct);}
      public static int count(int a) {
    	  int ct=0;
     while(a>0)
     {
    	 a=a/10;
    	 ct++;
     }
     
     return ct;
	}


}
