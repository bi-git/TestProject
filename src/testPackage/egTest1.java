package testPackage;

public class egTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("abc");
		//int arr[]=new int[10];
		int arr1[] = {16,17,4,3,5,2,7};
		System.out.println("Array size:"+arr1.length);
		egTest1 eg=new egTest1();
		eg.leadersInArray(arr1);
		eg.leadersInArray2(arr1, arr1.length);
		
	
	}
	
	void leadersInArray(int a[]) {
		int flag;
		int b[]=new int[a.length];
		int c=0;
		for(int i=0;i<a.length-1;i++) {
			System.out.println(a[i]);
			System.out.println("i:"+i);
			flag=0;
			for(int j=i+1;j<a.length;j++) {
				System.out.println("j:"+j);
				if(a[i]<=a[j]) {
					flag=1;
				}
			}
			if(flag==0) {
				System.out.println(a[i]);
				b[c]=a[i];
				c++;
			}
		}
		System.out.println(a.length-1+ ",c:"+c);
		int n=a.length-1;
		b[c]=a[n];
		System.out.println("Leaders are:"+b);
		for(int k=0;k<c+1;k++) {
			System.out.print(b[k] +" ");
		}
	}
	
	void leadersInArray2(int arr[],int n) {
		System.out.println("\n second one length"+n);
		for(int i=0;i<n;i++) {
			System.out.println("i"+i);
			int j;
			for(j=i+1;j<n;j++) {
				System.out.println("j:"+j);
				if(arr[i]<=arr[j]) {
					System.out.println(arr[i]);
					break;
				}
			}
				if(j==n) {
					System.out.println("leaders are:"+arr[i]);
				}
			
		}
	}

}
