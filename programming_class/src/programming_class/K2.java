package programming_class;

public class K2 {

	public static void main(String[] args) {
           int n=3;
           int k=5;
           int space=0;
           for(int i=0;i<n;i++)
           {
        	   for(int j=0;j<space;j++)
        	   {
        		   System.out.print(" ");
        	   }
        	   for(int j=0;j<k;j++)
        	   {
        		   System.out.print("*");
        	   }
           
           space=space+2;
           k=k-2;
           System.out.println();
	}
	}
}
