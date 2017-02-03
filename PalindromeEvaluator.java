//********************************************************************
//  PalindromeEvaluator.java       Author: Lewis and Loftus
//
//  Solution to Programming Project 11.1 (5E, p. 610)
//********************************************************************

public class PalindromeEvaluator
{
   private String testString;
   
   //-----------------------------------------------------------------
   //  Stores the string to be evaluated.
   //-----------------------------------------------------------------
   public PalindromeEvaluator (String test)
   {
      testString = test;
   }

   //-----------------------------------------------------------------
   //  Determines if the string is a palindrome.
   //-----------------------------------------------------------------
   public boolean isPalindrome()
   {
	   // What are the parameters for the first call
		// to the recursive program?
		// Enter the parameters here.
      return testPalindrome(0, testString.length()-1);
   }
   
   //-----------------------------------------------------------------
   //  Recursively determines if the string is a palindrome by
   //  testing smaller substrings.
   //-----------------------------------------------------------------
   private boolean testPalindrome (int left, int right)
   {
      boolean result;

      // Write the base case for the recursion program    
		if (left == right || right < left)  // base case
         result = true;
	   // Write the recursive part		
      else
		   // What is the repeated test to see if a string is a palindrome?
			// HINT: You'll need to use the charAt string method.
			// Refer back to page 243 for syntax example.
         if (testString.charAt(left) == testString.charAt(right))
			   // What are the changing parameters that should be passed
				// to each recursive call of the testPalindrome method?
            result = testPalindrome(left+1, right-1);
         else
            result = false;

      return result;
   }
}
