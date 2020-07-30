package programming_class;
import java.util.Scanner;
public class bubble_Sort {

	public static void main(String[] args) {
      Scanner s=new Scanner(System.in);
      System.out.println("Enter the size of an array");
      int size=s.nextInt();
      int a[]=new int[size];
      System.out.println("Enter the "+size+" elements in an array");
      for(int i=0;i<a.length;i++)
      {
    	  a[i]=s.nextInt();
      }
      int n=size;
      int temp;
      for(int j=0;j<n-1;j++)
      {
    	  for(int i=0;i<n-1;i++)
    	  {
    		  temp=a[i];
    		  if (a[i]>a[i+1]) {
				a[i]=a[i+1];
				a[i+1]=temp;
			}
    	  }
    	  
      }
      System.out.println("The bubble sorted part is as following :");
      for (int i = 0; i < a.length; i++) {
    	  System.out.println(a[i]);
		
	}
	}

}
