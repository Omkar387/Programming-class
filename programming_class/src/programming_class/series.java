package programming_class;

public class series {

	public static void main(String[] args) {
     int k1=1;
     int k2=1;
     int sum=0;
     for(int i=0;i<5;i++)
     {   
    	 
    	 System.out.print(k1+","+k2+",");
    	 sum=sum+k1+k2;

    	 k1=k1+3;
    	 k2=k2+1;
    	 
     }
     System.out.println("The sum of first 10 terms are "+sum);
	}

}
