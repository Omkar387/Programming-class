package programming_class;

public class B3 {

	public static void main(String[] args) {
        int n=4;
        int k=1;
        for(int i=0;i<n;i++)
        {
        	for(int j=0;j<n;j++)
        	{
        		if(i>=j)
        		{
        			if (i%2==0) {
						System.out.print(k++);
						
					}
        			else
        			{
        				System.out.print(k--);
        				
        			}
        		}
        	}
        	if(i%2==0)
        	{
        		k=k+i+1;
        	}
        	else
        		
        		
        	{
        		k=k+i+2;
        	}
        	System.out.println();
        }
	}

}
