package programming_class;

public class K4 {

	public static void main(String[] args) {
          int n= 4;
          int space=2;
          int k=1;
          for(int i=0;i<n;i++)
          {
        	  if(i==n)
    		  {
    			  space=1;
    			  k=3;
    		  }
        	  
        	  for(int j=0;j<space;j++)
        	  {   
        		 
        		  System.out.print(" ");
        	  }
        	  for(int j=0;j<k;j++)
        	  {
        		  System.out.print(k++);
        	  }
        	  System.out.println();
        	  space++;
        	  k=k+2;
          }
          
	}

}
