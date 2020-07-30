package programming_class;
import java.util.Scanner;
public class insert_element_at_given_index {

	public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the size of an array");
        int size=s.nextInt();
        int[]a=new int[size];
        System.out.println("Enter the elements of an array");
        for (int i = 0; i < a.length; i++) {
			a[i]=s.nextInt();
			
		}
        System.out.println("Enter the element to insert & index at respectively..!");
        int element=s.nextInt();
        int index=s.nextInt();
       int[]z=new int[(a.length+1)];
    		   z= insert(a,element,index);
       for (int i = 0; i < z.length; i++) {
    	   System.out.println(z[i]);
		
	}
	}
	public static int[] insert(int[]a,int element,int index)
	{
		int b[]=new int[(a.length+1)];
		b[index]=element;
		for (int i = 0; i < a.length; i++) {
			if (i<index) {
				b[i]=a[i];
				
			}
			
			else
			{
				b[i+1]=a[i];
			}
		}
		
		return b;
	}

}
