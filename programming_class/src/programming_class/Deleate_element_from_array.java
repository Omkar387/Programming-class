package programming_class;
import java.util.Scanner;
public class Deleate_element_from_array {

	public static void main(String[] args) {
      Scanner s=new Scanner(System.in);
      System.out.println("Enter the size");
      int size=s.nextInt();
      int[]a=new int[size];
      System.out.println("Enter thr values of an arry");
      for (int i = 0; i < a.length; i++) {
		a[i]=s.nextInt();
	}
      System.out.println("Enter the index to be del.");
      int index=s.nextInt();
      a=delEl(a,index);
      for (int i = 0; i < a.length; i++) {
		System.out.println(a[i]);
	}
	}
	public static int[] delEl(int[]a,int index)
	{
		int b[]=new int[(a.length-1)];
		for (int i = 0; i < b.length; i++) {
			if(i<index)
			{
				b[i]=a[i];
			}
			
			else
			{
				b[i]=a[i+1];
			}
		}
		return b;
	}

}
