package programming_class;

public class K1 {

	public static void main(String[] args) {
           char ch='A';
           int n=5;
           int k=1;
           char c='A';
           for(int i=0;i<n;i++)
           {
        	   ch=c;
        	   for(int j=0;j<k;j++)
        	   {
        		   if(j%2==0)
        		   {
        			   System.out.print(ch--);
        		   }
        		   else
        		   {
        			   System.out.print("*");
        		   }
        	   }
        	   System.out.println();
        	   k=k+2;
        	   c++;
           }
           
	}

}
