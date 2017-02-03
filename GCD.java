// Program Name:  GCD.java
// Programmer: Emilie Eggleston
// Assignment Number: Homework 2, Problem 3
// Purpose: Use Euclidean Algorithm to compute greatest common divisor of any 2 integers

import java.util.*;


public class GCD
{
	public static void main(String args[])
	{
		int int1, int2, bigint, smallint, remainder;
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter 2 integers: ");
		int1=scan.nextInt();
		int2=scan.nextInt();
		
		if(int1>int2)
		{
			bigint = int1;
			smallint = int2;
		}
		else
		{
			bigint = int2;
			smallint = int1;
		}
		
		do
		{
			remainder = bigint % smallint;
			
			if (remainder != 0)
			{
				bigint = smallint;
				smallint = remainder;
			}
			
		}while(remainder != 0);
		
		System.out.println("The GCD of "+int1+" and "+int2+" is "+smallint+".");
		
	}
}
