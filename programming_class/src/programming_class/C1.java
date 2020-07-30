package programming_class;

public class C1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   int n=4;
   int k=1;
   for(int i=0;i<n;i++)
   {
	   for(int j=0;j<n;j++)
	   {
		   if(i<=j)
		   {
			   System.out.print(k++);
		   }
	   }
	   System.out.println();
	   k=1;
   }
	}

}
