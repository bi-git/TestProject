package testPackage;


 class SingleTonModified {

	    private static SingleTonModified obj = null;

	    private SingleTonModified() {
	        System.out.println("Private Constructor is called");
	    }

	    public static SingleTonModified CreateObj() {
	        if (obj == null) {
	            obj = new SingleTonModified();
	        }
	        return obj;
	    }

	    public void display() {
	        System.out.println("The Ojecte creation complete");
	    }

	    public void display1() {
	        System.out.println("The second obj creation is comeplete");
	    }
	    }

	    public class SingleTonClass {

	    public static void main(String[] args) {
	    	//uncomment to view error when creating new objects of Singleton class
	    	/*
	    	SingleTonModified stc = new SingleTonModified();
	    	SingleTonModified stc1 = new SingleTonModified();
	    	SingleTonModified stc2 = new SingleTonModified();
	    	*/
	    	//solution to use singleton obj
	    	SingleTonModified stc = SingleTonModified.CreateObj();
	    	SingleTonModified stc1 = SingleTonModified.CreateObj();
	    	SingleTonModified stc2 = SingleTonModified.CreateObj();
	        // stc.display();
	        // stc1.display1();
	        System.out.println("Hashcode of x is "
                    + stc.hashCode());
 System.out.println("Hashcode of y is "
                    + stc1.hashCode());
 System.out.println("Hashcode of z is "
                    + stc2.hashCode());
	    }
	
}
