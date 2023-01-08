package testPackage;

import java.util.Arrays;
import java.util.Scanner;

public class helloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello World!");
		Scanner sc=new Scanner (System.in);
		int[] ar;
		//=new int[20];
		int num,digit,count=0,temp;
		System.out.println("enter any number :");
		num=sc.nextInt();
		
		temp=num;
		
		while(temp>0) {
			temp=temp/10;
			count++;
			
		}
		ar=new int[count];
		int i=0;
		while(num>0) {
			digit=num%10;
			num=num/10;
			ar[i]=digit;
			i++;
		}
		System.out.println("digits are :"+Arrays.toString(ar));
		System.out.println("count:"+count);
		
		
		

	}

}
