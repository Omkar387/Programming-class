package programming_class;
import java.util.Scanner;
public class areaOfCircle1{
    public static double area(double rad) {
	return 3.14*rad*rad;
	
    }
	

	public static void main(String[] args) {
     Scanner s=new Scanner(System.in);
     System.out.println("Enter the radius of a circle");
     double rad=s.nextDouble();
     double area=area(rad);
     System.out.println("The area of circle is "+area);
	}

}
