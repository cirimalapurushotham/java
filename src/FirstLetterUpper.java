
public class FirstLetterUpper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String s="mom is cook nice";
	       int l=s.length();
	       char[] ch1=s.toLowerCase().toCharArray();
	        ch1[0]=(char)(ch1[0]-32);
	       int i=1;
	       while(i!=l)
	       {
	    	   if(ch1[i]==' ')
	    	   {
	    	   ch1[i+1]=(char)(ch1[i+1]-32);
	    	   
	    	   }
	    	   i++;
	       }
	       System.out.println(ch1);
	}

}
