package programming_class;

public class J2 {

	public static void main(String[] args) {
      int n=5;
      int k=1;
      int m=1;
      int a;
      for(int i=0;i<n;i++)
      {
    	  a=m;
    	  for(int j=0;j<k;j++)
    		  
    	  {
    		  if(j%2==0)
    		  {
    			  System.out.print(a--);
    		  }
    		  else
    		  {
    			  System.out.print("*");
    		  }
    	  }
    	  System.out.println();
    	  k=k+2;
    	  m++;
      }

	}

}
