package testPackage;

import java.util.ArrayList;
import java.util.Collections;

public class Comparator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> al=new ArrayList<String>();
		al.add("abc");
		al.add("xyz");
		al.add("lmn");
		System.out.println("list:"+al);
		for(String a:al){
			System.out.println(a);
		}
		Collections.sort(al);
		System.out.println("After:");
		for(String a:al){
			System.out.println(a);
		}

	}

}
