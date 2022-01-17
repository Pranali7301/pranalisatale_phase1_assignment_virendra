package Java.program;

public class FunctionOverloading {

	
	public void FunctionOverloading(int a,int b)
	{
		System.out.println("Add two Number : "+ (a+b));
		
	}
	public void FunctionOverloading(int r)
	{
		System.out.println("Area of circle : "+(3.14*r*r));
	}
	public void FunctionOverloading(int l , float w) 
	{
		System.out.println("Area of Reactangle : "+(l*w));
	}
	public static void main(String[] args) {
		FunctionOverloading c = new FunctionOverloading();
		c.FunctionOverloading(10,20);
		c.FunctionOverloading(5);
		c.FunctionOverloading(3,5.0F);

	}

}