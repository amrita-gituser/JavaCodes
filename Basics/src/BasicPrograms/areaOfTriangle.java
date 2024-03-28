package BasicPrograms;

import java.util.Scanner;

public class areaOfTriangle {
	
	public int areaOfRightAngleTriangle()
	{
		int breadth,height,area;
		System.out.println("Enter Base and Height ");
		Scanner sc= new Scanner(System.in);
		breadth=sc.nextInt();
		height=sc.nextInt();
		area=(breadth*height)/2;
		return area;
	}
	
	public int areaOfTriangleWithSideValues()
	{
		int side1,side2,side3,S,area;
		System.out.println("Enter values of 3 sides ");
		Scanner sc= new Scanner(System.in);
		side1=sc.nextInt();
		side2=sc.nextInt();
		side3=sc.nextInt();
		S=(side1+side2+side3)/2;
		area=(int)Math.sqrt(S*(S-side1)*(S-side2)*(S-side3));
		return area;
	}
	
	public static void main(String[] args)
	{
		areaOfTriangle areaObj=new areaOfTriangle();
		int areaofRightTriangle=areaObj.areaOfRightAngleTriangle();
		System.out.println("Area with Breadth and Height is"+" "+areaofRightTriangle);
		int areawithSides=areaObj.areaOfTriangleWithSideValues();
		System.out.println("Area with 3 side values is"+" "+areawithSides);
	}

}
