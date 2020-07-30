package programming_class;
import java.util.Scanner;
public class happy {

	public static void main(String[] args) {
   Scanner s=new Scanner(System.in);
   System.out.println("Enter the number");
   int num=s.nextInt();
   int ld;
   int sum=0;
   while(num>9) 
	   {
	   
   sum=0;
   while (num>0) {
	   ld=num%10;
	   sum=sum+(ld*ld);
	   num=num/10;
   }
	
num=sum;
	}
   if(num==1||num==7) {
   System.out.println("Very Happy Number..!");
   }
   else
   {
	   System.out.println("Not happy number..!");
   }
   
	}

}
