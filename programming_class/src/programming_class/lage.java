package programming_class;

public class lage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int[]a= {205,56,55,62,69};
    // int k;
     int i=0;
    int k=0;
     while(i<a.length) {
    	 
    	 int lag=a[k];
    	 if (a[k]%2==1) {
			largest(a,k);
			break;
			
		}
    	 k++;
    	 i++;
    	 
     }
	}
	public static void largest(int[]a,int k)
	{
		int largest=a[k];
		for (int i = 0; i < a.length; i++) {
			if(a[i]%2==1&&a[i]>largest)
			{
				largest=a[i];
			}
		}
		System.out.println(largest);
	}
}
     
    
    

	
