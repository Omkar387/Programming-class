package programming_class;
import java.io.*;
public class Count_Space {

	public static void main(String[] args) throws Exception {
       new FileInputStream("input.txt");
      
       String s1="Hey , r u   free";
      int ct= process(s1);
       System.out.println(ct);
	}
	public static int process(String s1)
	{
		
       int ct=0;
       char []ch=s1.toCharArray();
       for (int i = 0; i < ch.length; i++) {
		if (ch[i]==' ') {
			ct++;
		}
		if (ch[i]==' '&&ch[i+1]==' ') {
			ct--;
		}
	}
       return ct;
	}

}
