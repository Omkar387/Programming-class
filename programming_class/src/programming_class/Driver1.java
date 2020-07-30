package programming_class;
import java.util.Scanner;

public class Driver1 {

	public static void main(String[] args) throws Exception {
    Scanner s=new Scanner(System.in);
    System.out.println("Enter the number of Employees..!");
    int count=s.nextInt();
             Employee[] e1=new Employee[count];
           for (int i = 0; i < e1.length; i++) {
		System.out.println("Enter the details of employee "+(i+1));
		
		System.out.println("Enter the name of emoloyee");
		String name=s.next();
		System.out.println("Enter the Eid of an employee");
		int Eid=s.nextInt();
		System.out.println("Enter the sal of an Employee");
		double sal=s.nextDouble();
		e1[i]=new Employee(name,Eid,sal);
		
	}
           leastSal(e1);
	}
           
           public static void leastSal(Employee[]e1)
           {
        	  double leastsal= e1[0].sal;
        	  int k=0;
        	  for (int i = 0; i < e1.length; i++) {
				if (e1[i].sal<=leastsal) {
					leastsal=e1[i].sal;
					k=i;
				}
			}
        	  display(e1,k);
           }
           public static void display(Employee[]e1,int k)
           {
        	   System.out.println("*******************");
        	   System.out.println("The details of an Employee having least salary is as follows :");
        	   System.out.println("Name :" +e1[k].name);
        	   System.out.println("Eid : "+e1[k].Eid);
        	   System.out.println("Salary : "+e1[k].sal);
        	   
           }
          
	

}
