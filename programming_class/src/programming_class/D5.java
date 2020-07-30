package programming_class;

public class D5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           int n=4;
           int k=2;
           for(int i=0;i<n;i++)
           {
        	   for(int j=0;j<n;j++)
        	   {
        		   if(i+j<=n-1)
        		   {
        			   System.out.print(k);
        			   k=k+2;
        		   }
        	   }
        	   System.out.println();
        	   k=2;
           }
	}

}
