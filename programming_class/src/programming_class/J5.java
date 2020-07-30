package programming_class;

public class J5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=3;
		int k=1;
		int space=4;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<space;j++)
			{
				System.out.print(" ");
			}
			for(int m=0;m<k;m++)
			{
				System.out.print("*");
			}
			System.out.println();
			k=k+2;
			space=space-2;
		}
		

	}

}
//https://forms.gle/HzUpadCdLr5iUoyB6
 