import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	     String s="test yantra";
	     String c="test yantra";
	     int l=s.length();
	     s=s.toLowerCase();
	     c=c.toLowerCase();
	     char[] ch=s.toCharArray();
	     char[] ch1=c.toCharArray();
	     
	     Arrays.sort(ch);
	     Arrays.sort(ch1);
	     
	     int i=0;
	     while(i!=l)
	     {
	    	if(ch[i]!=ch1[i])
	    	{
	    		System.out.println("not anagram");
	    		System.exit(0);
	    	}
	    	else
	    	{
	    		i++;
	    	}
	    	 
	     }
	     System.out.println("anagram");
	}

}
