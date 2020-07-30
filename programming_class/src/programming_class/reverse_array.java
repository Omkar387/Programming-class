package programming_class;

public class reverse_array {

	public static void main(String[] args) {
          int []a= {10,20,33,65,66};
          int []b=reverseArray(a);
          for (int i = 0; i < b.length; i++) {
			System.out.println(b[i]);
		}
	}
	public static int[] reverseArray(int[]a)
	{
		int[]b=new int[(a.length)];
		int k=a.length-1;
		for (int i = 0; i < b.length; i++) {
			b[i]=a[k];
			k--;
		}
		return b;
	}

}
