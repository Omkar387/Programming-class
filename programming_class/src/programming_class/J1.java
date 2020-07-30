package programming_class;

public class J1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int n=5;
     int k=1;
     int a=1;
     for(int i=0;i<n;i++)
     {
    	 for(int j=0;j<k;j++)
    	 {
    		 if (a==10)
    		 {
    			 a=1;
    		 }
    		 if (j%2==0) {
				 System.out.print(a++);
			}
    	 else {
				System.out.print("*");
    	 }
    	 }
    	 System.out.println();
    	 k=k+2;
     }
	}

}
