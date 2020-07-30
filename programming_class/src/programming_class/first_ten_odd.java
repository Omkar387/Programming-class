package programming_class;

public class first_ten_odd {

	public static void main(String[] args) {
        int a[]=new int[10];
        int k=1;
        for (int i = 0; i < a.length; k++) {
			if (k%2==1) {
				a[i]=k;
				i++;
			}
		
		}
        for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}

}
