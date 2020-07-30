package programming_class;

public class D4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		int m=4
				;
		int k;
		for(int i=0;i<n;i++) {
			k=m;
			for(int j=0;j<n;j++)
			{
			if(i+j<=n-1)
			{
				System.out.print((char)('A'+k));
				k--;
			}
				
			}
			System.out.println();
			m--;
		}

	}

}
