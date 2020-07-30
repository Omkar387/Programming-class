package programming_class;

public class insertion_sort {

	public static void main(String[] args) {
          int a[]= {10,3,5,2,1};
          for (int i = 1; i < a.length; i++) {
			int j=i-1;
			int temp=a[i];
			while (j>=0&&temp<a[j]) {
				a[j+1]=a[j];
				j--;
				
			}
			a[j+1]=temp;   
		} 
          System.out.println("The sorted array are as followig  :");
          
          for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}

}
