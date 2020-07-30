package programming_class;
import java.util.Scanner;
public class areaOfReactange {

	public static void main(String[] args) {
       Scanner s=new Scanner(System.in);
       System.out.println("Enter the length and width of a reactangle");
       double l=s.nextDouble();
       double w=s.nextDouble();
       double area=area(l,w);
       System.out.println("The area of reactanle is "+area);
	}
	public static double area(double l,double w)
	{
		return l*w;
	}

}
