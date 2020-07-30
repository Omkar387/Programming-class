package programming_class;

public class Amar {

	public static void main(String[] args) {
        String s="He is  a     busy my   father";
        char[]a=s.toCharArray();
        int ct=0;
        char space=' ';
        for (int i = 0; i < a.length; i++) {
			if (a[i]==space) {
				ct++;
			}
        }
        String s1=new String(a);
        for (int j = 0; j < s1.length()
        		; j++) {
        	
			if(j<s1.length()-1) {
			if (s1.charAt(j+1)==space&&s1.charAt(j)==space) {
			ct--;
			}
			}
		}
        
			
			
			
			
		
		
        System.out.println(ct);
	}

}
