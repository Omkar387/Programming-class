package programming_class;

public class D3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   int n=4;
   int k=1;
   
   for(int i=0;i<n;i++)
   {
	   for(int j=0;j<n;j++)
	   {
		   if(i>=j)
		   {
			   if(k==9)
			   {
				   k=1;
			   }
			   System.out.print(k);
			   k=k+2;
		   }
	   }
	   System.out.println();
   }
	}

}
