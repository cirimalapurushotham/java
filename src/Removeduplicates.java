

	import java.util.LinkedHashMap;
	import java.util.Map;
	import java.util.Set;

	public class Removeduplicates {

		public static void main(String[] args) {
			String s="Test Yantra";
			char y[]=s.toCharArray();
			int size=y.length;
			

	        Map<Character,Integer> map=new LinkedHashMap();
	        int i=0;
	        while(i!=size)
	        {
	        	if(map.containsKey(y[i])==false)
	        	{
	        		map.put(y[i],1);
	        	}
	        	else
	        	{
	        		int oldval = map.get(y[i]);
	        		int newval = oldval + 1;
	        		
	        		map.put(y[i],newval);
	        		
	        	}
	        	++i;
	        }
	        
	        Set<Map.Entry<Character,Integer>> lhmap = map.entrySet();
	        
	        String res="";
	        
	        for(Map.Entry<Character,Integer>data : lhmap)
	        {
	        	res=res + data.getKey();
	        }
			System.out.println(res);
			
	}

}
