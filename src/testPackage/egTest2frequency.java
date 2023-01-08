package testPackage;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.*;
//import java.util.Entry;

public class egTest2frequency {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[]= {1,5,2,1,3,2,1,5,1,2,5,5,5};
		int n=arr.length;
		System.out.println(findFrequent(arr, n));
		
	}
	static int findFrequent(int arr[],int size) {
		int element = 0;
		Map<Integer,Integer> newhp=new HashMap<Integer,Integer>();
		for(int i=0;i<size;i++) {
			int key=arr[i];
			if(newhp.containsKey(key))
			{
			int freq=newhp.get(key);
			freq++;
			newhp.put(key, freq);
			}
			else
				newhp.put(key, 1);
			
		}
		int max=0;
		
		for(Entry<Integer, Integer> e : newhp.entrySet()) {
		if(max<e.getValue()) {
			element=e.getKey();
			max=e.getValue();
		}
			
		}
		return element;
	}

}
