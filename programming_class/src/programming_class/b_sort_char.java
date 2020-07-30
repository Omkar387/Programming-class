package programming_class;

import java.util.Arrays;

public class b_sort_char {

	public static void main(String[] args) {
		String s="IamOmkar";
		s=s.toLowerCase();
		char ch[]=s.toCharArray();
		Arrays.sort(ch);
	String s1=new String(ch);
	System.out.println(s1);
	}
}
