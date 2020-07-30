package programming_class;

public class cube {
	public static double cube(double x) {
		int i=1;
		int n=3;
	double cube=1;
		while(i<=n)
		{
			cube=cube*x;
			i++;
		}
		return cube;
	}

	public static void main(String[] args) {
       double cube= cube(3);
        System.out.println( "Cube of given no is "+cube);
	}

}
