public class InvalidAgeException extends Exception {
	public InvalidAgeException(String s)
	
    {
		super(s);
		System.out.println("Age is below 15");
        // Call constructor of parent Exception
        
    }

}