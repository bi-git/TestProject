package testPackage;

public class TestException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("hi");
int a=expection_checking();
System.out.println("value:"+a);

String[] s1=new String[]{"apple","banana"};
for(String s:s1)
System.out.println(s);

class Abc{
	int name;
	Abc(int name){
		this.name=name;		
	}
}
System.out.println("equals checking :");
Abc ab=new Abc(1);
Abc b=new Abc(1);
System.out.println(ab.equals(b));

	}
	 static int expection_checking() {
int testnum = 12;
try {
   System.out.println("try - first statement");
   int a=5/0;
   System.out.println("try - last statement");
   return 10;
}
catch ( Exception ex) {
   System.out.println("Exception Caught"); 
   return 20;
}
finally {
   System. out. println( "finally") ;
   //return 30;
}

}
	}


