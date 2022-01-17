package phase1assistedproject;

public class datatypescon1 {
	public static void main(String[] args)
	{
		int i = 100;
		long l = i;
		System.out.println("long value "+ l);
		
		int o =(int) l;
		System.out.println("int value "+ o);
		
		char t =(char) i;
		System.out.println("char value "+ t);
		
		double d= 16763787653764.0065443356775544;
		float r= (float) d;
		System.out.println("float value "+ r);
		System.out.println("double value "+ d);
		
		double d2 = 16763787653764.0065443356775544;
		long l2 = (long)d2;
		int i2 = (int)12;
		System.out.println("double value "+d2);
		System.out.println("long value "+l2);
		System.out.println("int value "+i2);
		
		float f = l;
		System.out.println("float value "+ f);
		
		byte b;
		int ii = 257;
		double dd = 323.142;
		
		System.out.println("Conversion of int to byte. ");
		b = (byte) ii;
		System.out.println("ii =" + ii + " b = " + b);
		
		System.out.println("\nConversion of double to byte. ");
		
		b = (byte) dd;
		System.out.println("dd = " + dd + " b= " + b);

		
		
		
		
		
		
		
		
		
		
		
	}

}



