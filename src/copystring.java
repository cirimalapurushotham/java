
public class copystring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       String s="tesy yantra";
       int l=s.length();
       char[] ch1=s.toCharArray();
       char[] ch=new char[l];
       int i=0;
       while(i!=l)
       {
    	   ch[i]=ch1[i];
    	   i++;
       }
       System.out.println(ch);
	}

}
