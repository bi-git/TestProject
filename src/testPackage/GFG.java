package testPackage;

public class GFG {
	public static void main (String[] args)
    {
        // String s set an empty string  and calling getLength()
        String s = "";
        System.out.println("hello");
        try
        {
            System.out.println(getLength(s));
        }
        catch(IllegalArgumentException e)
        {
            System.out.println("IllegalArgumentException caught");
        }
  
        // String s set to a value and calling getLength()
        s = "GeeksforGeeks";
        try
        {
            System.out.println(getLength(s));
        }
        catch(IllegalArgumentException e)
        {
            System.out.println("IllegalArgumentException caught");
        }
  
        // Setting s as null and calling getLength()
        s = null;
        try
        {
            System.out.println(getLength(s));
        }
        catch(IllegalArgumentException e)
        {
            System.out.println("IllegalArgumentException caught" );
            System.out.println(e.getMessage());
        }
        
        System.out.println("next part:");
        String str = null;
        String message = (str == null) ? "" :
                          str.substring(0,5);
        System.out.println(message);
  
        // Initializing String variable with null value
        str = "Geeksforgeeks";
        message = (str == null) ? "" : str.substring(0,5);
        System.out.println(message);
    }
  
    // Function to return length of string s. It throws
    // IllegalArgumentException if s is null.
    public static int getLength(String s)
    {
        if (s == null)
            throw new IllegalArgumentException("The argument cannot be null");
        return s.length();
    }

}
