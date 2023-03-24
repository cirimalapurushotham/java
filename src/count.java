
public class count {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       String s="test yantra";
       s=s.concat("/");
       char ch[]=s.toCharArray();
       int i=0;
       int count=0;
       while(ch[i]!='/')
       {
    	   count++;
    	   i++;
       }
		System.out.println(count);
		
		
	}

}
