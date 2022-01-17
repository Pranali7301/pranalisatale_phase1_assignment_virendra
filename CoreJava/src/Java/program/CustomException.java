package Java.program;

public class CustomException {
	 static void validate(int sal)throws InvalidAgeException{  
	     if(sal<2100)  
	      throw new InvalidAgeException("work hard");  
	     else  
	      System.out.println("great work");  
	     if(sal<9000)  
		      throw new InvalidAgeException("work hard");  
		     else  
		      System.out.println("Your salary is very good"); 
	   }  
	     
	   public static void main(String args[]){  
	      try{  
	        validate(50000);  
	      }
	      catch(Exception m)
	      {
	    	  System.out.println("Exception occured: "+ m.getMessage());
	      }  
	  
	      System.out.println("rest of the code...");  
	  }  
	}  

//This class is created for your own defined exception message
class InvalidAgeException extends Exception{  // 1
	
	//private static final long serialVersionUID = 1L;

	InvalidAgeException(String s){  //2
	  super(s);  
	 }  
}
