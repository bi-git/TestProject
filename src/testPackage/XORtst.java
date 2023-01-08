package testPackage;

public class XORtst {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = new int[99];
		for(int i=0;i<51;i++) {
			
			if(i==50)
				break;
			else
				arr[i]=i+1;
			
			System.out.println(arr[i]);
		}
		System.out.println("break?");
		for(int i=50;i<99;i++)
		{
			arr[i]=i+2;
			System.out.println(arr[i]);
		}
		System.out.println("array is :"+arr.length);
		for(int i=0;i<99;i++) {
			System.out.println(arr[i]);
		}
		
		int result=xorValue(arr);
		System.out.println("testing :");
		System.out.println(0^2);
		System.out.println("result is: "+result);
	}
		public static int xorValue(int[] arr) {
		// Assuming that the array contains 99 distinct integers between 1..99
		// and empty slot value is zero
		int XOR = 0;
		for(int i=0; i<99; i++) {
		    //if (arr[i] != 0) // remove this condition keeping the body if no zero slot
		    XOR ^= arr[i];
		    System.out.println("xor"+XOR);
		    XOR ^= (i + 1);
		    System.out.println("XOR:"+XOR);
		}
		return XOR^ arr.length + 1;
		//return XOR ^ ARRAY.length + 1; if your array doesn't have empty zero slot. 
		}	
		
	
}
