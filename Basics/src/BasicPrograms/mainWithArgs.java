package BasicPrograms;

import java.util.Scanner;

public class mainWithArgs {
	
	public static  void main(String arg[])
	{
		System.out.println("Printing Args");
		
		//Take arguement input
		Scanner inpobj=new Scanner(System.in);
		System.out.println("Enter arguement value");
		String argVal= inpobj.next();
		
		//Print the arguement
		System.out.println(argVal);
	}

}
