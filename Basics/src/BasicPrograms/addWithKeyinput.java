package BasicPrograms;

import java.util.Scanner;

public class addWithKeyinput {

	public static void main(String[] args) {
		int n1, n2,n3,n4,res;
		System.out.println("Enter 2 numbers"+"\n");
		Scanner sc=new Scanner(System.in);
		n1=sc.nextInt();
		n2=sc.nextInt();
		
		res=n1+n2;
		System.out.println("Result1 is"+res);
		
		sc.useRadix(2);
		System.out.println("Enter some binary value");
		n3=sc.nextInt();
		System.out.println("Integer value for binary number entered is "+n3);

	}

}
