import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class Max_char_occu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String s="pprshotam";
         char ch[]=s.toCharArray();
         
         Map<Character,Integer> m=new LinkedHashMap();
         
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
              char max=' ';
              int maxv=0;
         
                      Set<Entry<Character, Integer>> v=m.entrySet();
		              for( Map.Entry<Character, Integer> data:v)
		              {
		            	  if(data.getValue()>maxv)
		            	  {
		            		  maxv=data.getValue();
		            		  max=data.getKey();
		            		  
		            	  }  
		            		
		            	  }
		              
		              System.out.println(max+" "+maxv);
		              
		              
		              }
	  
		             
		
		
		

		
		
	}
	



	


