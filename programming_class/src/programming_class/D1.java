package programming_class;

public class D1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int n=5;
      char ch='A';
      int k=1;
      for (int i=0;i<n;i++)
      {
    	  for (int j=0;j<n;j++)
    	  {
    		  if(i+j<=n-1)
    		  {
    			  if(i%2==0)
    			  {
    				  System.out.print(k++);
    			  }
    			  else
    			  {
    				  System.out.print(ch++);
    			  }
    		  }
    		  
    	  }
    	  
    	  System.out.println();
    	  ch='A';
    	  k=1;
      }
	}

}
