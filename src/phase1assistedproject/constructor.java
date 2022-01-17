package phase1assistedproject;

	class calculate
	{
		//Zero argument constructor
		calculate()
		{
			System.out.println("zero argument constructor");
		}
		//parameterised constructor
		public calculate(int a,int b)
		{
		int  c=a+b;
		System.out.println("addition of two numbers"+ c);
		return;
		}
		
		public calculate(int r)
		{
		 double circle=0.5*3.14*r*r;
		 System.out.println("area of circle"+ circle);
		 return;
		}
		 
		 public calculate(double width,int length)
		 {
		 double rect=length*width;
		 System.out.println("area of rectangle"+rect);
		 return;
		 }
		public static void calculate1(double d, int j) {
			// TODO Auto-generated method stub
		
		}
	}

	public class constructor
	{
		@SuppressWarnings("static-access")
		public static void main(String[] args)
		{
		  calculate cal=new calculate();
		  calculate.calculate1(2,3);
		  cal.calculate1(52, 0);
		  cal.calculate1(9.85,6);
		 }
	}
	





