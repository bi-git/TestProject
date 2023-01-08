package testPackage;

public class Singleton {
	

	    //private static final Singleton INSTANCE = new Singleton();

	    private static Singleton obj =null;
	    
	    private Singleton() {
	        // This is called only once
	        //System.out.println("Private Constructor is called");
	    	
	    }

	    public static synchronized Singleton getInstance() {
	        //return INSTANCE;
	    	if(obj==null) {
	    		obj=new Singleton();
	    	}
	    	return obj;
	    }

	    public static void main(String[] args) {

	        // Even if you ask 100 times, this will only return the same INSTANCE
	        /*
	    	Singleton stc  = new Singleton();//Singleton.getInstance();
	        Singleton stc1 = new Singleton(); //Singleton.getInstance();
	        Singleton stc2 = new Singleton(); //Singleton.getInstance();
	        */
	        Singleton stc  = Singleton.getInstance();
	        Singleton stc1 = Singleton.getInstance();
	        Singleton stc2 = Singleton.getInstance();
	        
	        
	        System.out.println("Hashcode of x is "
                    + stc.hashCode());
 System.out.println("Hashcode of y is "
                    + stc1.hashCode());
 System.out.println("Hashcode of z is "
                    + stc2.hashCode());
	    }

	
}
