package testPackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class StringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	    String input = "Rain rain go away";
	
	//    output = tnw-4, rain-2, go-1, away-1
	    HashMap<String,Integer> hmap=new HashMap<String,Integer>();
	    ArrayList<String> slist=new ArrayList<String>();
	    String[] s=input.split(" ");
	    //System.out.println(s);
	    for(String s1:s) {
	    	
	    	s1=s1.toLowerCase();
	    	if(hmap.containsKey(s1)) {
	    		hmap.get(s1);
	    	}
	    	hmap.put(s1, hmap.get(s1));
	    }
	    for(Entry<String, Integer> m:hmap.entrySet())
	    {
	    	System.out.println(m.getKey() +":"+m.getValue());
	    }
	    
	    

	}

}
