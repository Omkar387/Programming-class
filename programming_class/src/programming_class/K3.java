package programming_class;

public class K3 {

	public static void main(String[] args) {
          int k=1;
          int space=2;
          int n=3;
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
        	  System.out.println();
        	  k=k+2;
        	  space=space-1;
          }
          
	}

}
