package programming_class;
import java.util.Scanner;
public class multiplication_table {

	public static void main(String[] args) {
Scanner s=new Scanner(System.in);
    System.out.println("Enter the number for multiplication");
    int num=s.nextInt();
    int temp=num;
    
    for(int i=1;i<=10;i++)
    {
    	System.out.println(num+" *  "+i+ "   = "+(num*i));
    	
    }
	}

}
