package programming_class;
import java.util.Scanner;
public class s_sort {

	public static void main(String[] args) {
             Scanner s=new Scanner(System.in);
             System.out.println("enter the size of an array");
             int n=s.nextInt();
             int a[]=new int[n];
             System.out.println("Enter the elements of an array");
             for (int i = 0; i < a.length; i++) {
				a[i]=s.nextInt();
			}
             for (int i = 0; i < a.length-1; i++) {
				int temp=a[i];
				int min=i;
				for (int j = i+1; j < a.length; j++) {
					if (a[j]<a[min]) {
						min=j;
					}
					
				}
				if (min!=i) {
					a[i]=a[min];
					a[min]=temp;
				}
			}
             System.out.println("The sorted array as following:");
             for (int i = 0; i < a.length; i++) {
				System.out.println(a[i]);
			}
	}

}
