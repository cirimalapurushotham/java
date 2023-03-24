
public class Lowercase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String s="Mom";
	       int l=s.length();
	       char[] ch1=s.toCharArray();
	       char[] ch=new char[l];
	       int i=0;
	       while(i!=l)
	       {
	    	   if(ch1[i]!=' ')
	    	   {
	    		   ch1[i]=(char)(ch1[i]-32);
	    	   }
	    	   i++;
	       }
	       System.out.println(ch1);
	}

}
