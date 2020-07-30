package programming_class;

public class B4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          int n=6;
          int k=1;
          int m=1;
          for (int i=0;i<n;i++)
          {     if(i==n-1)
          {
        	  k=3;
          }
        	  for(int j=0;j<k;j++)
        	  {
        		  
        		  if(j%2==0)
        		  {
        			  System.out.print(m%2);
        			  m++;
        		  }
        		  else
        		  {
        			  System.out.print("*");
        		  }
        	  }
        	  System.out.println();
        	  k=k+2;
          }
	}

}
