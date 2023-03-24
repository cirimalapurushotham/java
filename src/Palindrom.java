
public class Palindrom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  String s="mom";
	       int l=s.length();
	       char[] ch1=s.toCharArray();
	       char[] ch=new char[l];
	       int i=0;
	       while(i!=l)
	       {
	    	   ch[l-1-i]=ch1[i];
	    	   i++;
	       }
	       
	       i=0;
	       while(i!=l)
	       {
	    	   if(ch[i]!=ch1[i])
	    	   {
	    		   System.out.println("not palindrom");
	    		   System.exit(0);
	    	   }else
	    	   {
	    		   i++;
	    	   }
	       }
	       System.out.println("palindrom");
		}

	}


