package programming_class;

public class D2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  int n=7;
  int k;
  int m=0;
   
  for(int i=0;i<n;i++)
  {      k=n-m;
	  for(int j=0;j<n;j++)
	  {
		  if(i+j<=n-1)
		  {
			  System.out.print(k--);
		  }
	  }
	  System.out.println();
	  m++;
  }
	}

}
