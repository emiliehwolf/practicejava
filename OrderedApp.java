// Program Name:  OrdArray.java
// Programmer: Emilie Eggleston
// Assignment Number: Project 1
// Purpose: To demonstrate how to merge and find common
// values in ordered arrays

class OrderedApp
{
	public static void main(String[] args)
	{
		int maxA = 1 + (int)(Math.random() * 30);
		int maxB = 1 + (int)(Math.random() * 30);
		
		OrdArray A = new OrdArray(maxA);
		OrdArray B = new OrdArray(maxB);
		
		for (int i = 0; i < maxA; i++)
			A.insert((long)(Math.random() * 100));
		
		for (int i = 0; i < maxB; i++)
			B.insert((long)(Math.random() * 100));
		
		A.display();
		B.display();
		OrdArray.merge(A, B).display();
		OrdArray.common(A, B).display();
	}
}