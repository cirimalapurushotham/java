import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Uniquecharec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         String s="prshotam";
         char ch[]=s.toCharArray();
         
         Map<Character,Integer> m=new HashMap();
         
         int i=0;
         while(i!=ch.length)
         {
        	 if(m.containsKey(ch[i])==false)
        	 {
        		 m.put(ch[i],1);
        	 }
        	 else
        	 {
        		      int n= m.get(ch[i]);
        		      int f=n+1;
        		      m.put(ch[i],f);
        	 }
        	 i++;
        	 
         }
         
                      Set<Entry<Character, Integer>> v=m.entrySet();
		              for( Map.Entry<Character, Integer> data:v)
		              {
		            	  if(data.getValue()>1)
		            	  {
		            		 System.out.println("not");
		            		 System.exit(0);
		            	  }
		              }
		              System.out.println("yes");
		
		
		
		
		
		
	}

}
