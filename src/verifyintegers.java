
public class verifyintegers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String s="23546";
		 char[] ch=s.toCharArray();
		 int l=s.length();
		 int i=0;
		 while(i!=l)
		 {
			 if(ch[i]>='0'&& ch[i]<='9')
			 {
				  i++;
			 }
			 else
			 {
				 System.out.println("not");
				 System.exit(0);
			 }
		 }
		 System.out.println("yes");
	}

}
