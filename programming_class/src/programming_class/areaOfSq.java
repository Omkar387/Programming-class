package programming_class;
import java.util.Scanner;
public class areaOfSq {

	public static void main(String[] args) {
       Scanner s=new Scanner(System.in);
       System.out.println("Enter the sides of square");
       double side=s.nextDouble();
       double area=sArea(side);
       System.out.println( "The are of given square is "+area);
	}
	public static double sArea(double a)
	{
		return a*a;
	}

}
