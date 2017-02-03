// Program Name:  OrdArray.java
// Programmer: Emilie Eggleston
// Assignment Number: Project 1
// Purpose: To demonstrate how to merge and find common
// values in ordered arrays
// To run this program, run OrderedApp

class OrdArray
{
	
	public static OrdArray merge(OrdArray A, OrdArray B)
	{
		OrdArray C = new OrdArray(A.size()+B.size());	//Max size of merge array C is A+B
		
		for (int i = 0; i < A.size(); i++)
		{
			if (C.find(A.getElem(i)) == C.size())
				C.insert(A.getElem(i));
		}
		
		for (int i = 0; i < B.size(); i++)
		{
			if (C.find(B.getElem(i)) == C.size())
				C.insert(B.getElem(i));
		}
		
		return C;
	}
	
	
	
	
	public static OrdArray common(OrdArray A, OrdArray B)
	{
		OrdArray D = new OrdArray(A.size() < B.size() ? A.size() : B.size());	//Max size of common array D the smaller
		
		// Swap if necessary for A to be smaller.
		if (A.size() > B.size())
		{
			OrdArray temp = A;
			A = B;
			B = temp;
		}
		
		
		// After swapping, A is always the smaller.
		for (int i = 0; i < A.size(); i++)
		{
			if (B.find(A.getElem(i)) != B.size())
				D.insert(A.getElem(i));
		}
		
		return D;
	}
	
	
	
	private long[] a;
	private int nElems;
	
	
	
	public OrdArray(int max)
	{
		a = new long[max];
		nElems = 0;
	}
	
	public int size()
	{	return nElems; }
	
	
	
	public long getElem(int elem)
	{
		return a[elem];			//returns the value of a particular element(index) of the array
	}
	
	
	
	public int find(long searchKey)    	//Binary Search
	{
		int lowerBound = 0;
		int upperBound = nElems - 1;
		int curIn;
		
		while(true)
		{
			curIn = (lowerBound + upperBound)/2;
			if(a[curIn]==searchKey)
				return curIn;
			else if(lowerBound > upperBound)
				return nElems;
			else
			{
				if(a[curIn] < searchKey)
					lowerBound = curIn + 1;
				else
					upperBound = curIn - 1;
			}
		}
	}
	
	public void insert(long value)
	{
		int j;
		for(j=0; j<nElems; j++)   
			if(a[j]>value)			//locates index in ordered array that has value larger than insert
				break;
		
		for(int k=nElems; k>j; k--)
			a[k]=a[k-1];			//moves down all values
		
		a[j]=value;			//inserts new value into ordered array
		nElems++;			//increases length of array elements by 1
	}
	
	public boolean delete(long value)
	{
		int j = find(value);
		if(j==nElems)
			return false;
		else
		{
			for(int k=j;k<nElems;k++)
				a[k]=a[k+1];
			nElems--;
			return true;
		}
	}
	
	
	public void display()
	{
		for(int j=0;j<nElems;j++)
			System.out.print(a[j]+" ");
		System.out.println("");
	}
}

