package programming_class;
import java.util.Scanner;
public class i_sort {

	public static void main(String[] args) {
         Scanner s=new Scanner(System.in);
         System.out.println("Enter the size");
         int n=s.nextInt();
         int a[]=new int[n];
         System.out.println("Enter the elements of an array");
         for (int i = 0; i < a.length; i++) {
			a[i]=s.nextInt();
		}
         for (int i = 1; i < a.length; i++) {
			int temp=a[i];
			int j=i-1;
			while (j>=0&&temp<a[j]) {
				a[j+1]=a[j];
				j--;
			}
			a[j+1]=temp;
		}
         System.out.println("The sorted elements are as following ");
         for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}

}
