package Java.program;

public class MethodConstructor {

		float a;
		int b,p,q,d,tr;
		long base,height;
		long c;
		int romb;
		
		public void rom(int p,int q)
		{
			romb=(p*q/2);
			System.out.println("Area of Rhombus : "+romb);
		}
		public void tri(long base,long height)
		{
			tr=(int) (0.5*base*height);
			System.out.println("Area of Triangle : "+tr);	
		}
		public  MethodConstructor(Float s) 
		{
			a=s;
		}
		public MethodConstructor(int l ,long w)
		{
			b=l;
			c=w;
		}
		public MethodConstructor(int r)
		{
			d=r;
		}
		
		public void display()
		{
			System.out.println("Area of square : "+(a*a));	
		}
		public void display1()
		{
			System.out.println("Area of rect : "+(b*c));
		}
		public void display2()
		{
			System.out.println("Area of cir : "+(3.14*d*d));
		}
		public static void main(String[] args) {
			MethodConstructor ca = new MethodConstructor(10.0F);
		ca.display();
		MethodConstructor a = new MethodConstructor(5,3);
		a.display1();
		MethodConstructor b = new MethodConstructor(6);
		b.display2();
		//CalArea ca3 = new CalArea(10,15);
		ca.rom(10,15);
		ca.tri(2,3);
	}
	}

