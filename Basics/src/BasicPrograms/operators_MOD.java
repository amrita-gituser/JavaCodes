package BasicPrograms;

public class operators_MOD {
	int res1,res2,res6;
	float res3, res4,res5;
	
	
	public int displayMOD_intOne()
	{
		int a=102;
		int b=10;
		res1= a/b;
		return res1;
		
	}
	public int displayMOD_intTwo()
	{
		int a=102;
		int b=10;
		res2= a%b;
		return res2;
		
	}
	public float displayMOD_floatOne()
	{
		float c= 25.6f;
		float d= 5f;
		
		res3=c/d;
		return res3;
	}
	public float displayMOD_floatTwo()
	{
		float c= 25.6f;
		float d= 5f;
		
		res4=c%d;
		return res4;
		
	}
	public float displayMOD_intAndFloat()
	{
		float c= 25.6f;
		int d= 5;
		
		res5=c/d;
		return res5;
		
	}
	public int displayMOD_intAndFloat2()
	{
		float c= 25.6f;
		int d= 5;
		
		res6=(int) (c/d);
		return res6;
		
	}
	
	public static void main(String[] args)
	{
		operators_MOD modObj= new operators_MOD();
		int result1= modObj.displayMOD_intOne();
		System.out.println("Quotient is"+" "+result1);
		int result2= modObj.displayMOD_intTwo();
		System.out.println("Remainder is"+" "+result2);
		float result3= modObj.displayMOD_floatOne();
		System.out.println("Quotient is"+" "+result3);
		float result4= modObj.displayMOD_floatTwo();
		System.out.println("Remainder is"+" "+result4);
		float result5= modObj.displayMOD_intAndFloat();
		System.out.println("Quotient is"+" "+result5);
		float result6= modObj.displayMOD_intAndFloat2();
		System.out.println("Quotient is"+" "+result6);
		//Same Results but returns int value
		int result7= modObj.displayMOD_intAndFloat2();
		System.out.println("Quotient is"+" "+result7);
				
	}

}
