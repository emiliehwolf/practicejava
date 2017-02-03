// Program Name:  SpiralTraversal.java
// Programmer: Emilie Eggleston
// Assignment Number: Bonus 1
// Purpose: To display a 2-d array in a clockwise spiral


public class SpiralTraversal
{
       public static void main(String args[])
       {
               char[][] spiral = { 
            		   		   {'A','B','C','D','E'},
                               {'1','2','3','4','5'},
                               {'A','B','C','D','E'},
                               {'1','2','3','4','5'}};

               int leftSide = 0;
               int rightSide = spiral[0].length - 1;
               int topSide = 0;
               int bottomSide = spiral.length - 1;

               while (topSide < bottomSide && leftSide < rightSide)
               {
                       // Move right
                       for (int i = leftSide; i <= rightSide; i++)
                               System.out.print(spiral[topSide][i]);

                       topSide++;

                       // Move down
                       for (int i = topSide; i <= bottomSide ; i++)
                               System.out.print(spiral[i][rightSide]);

                       rightSide--;

                       // Move left
                       for (int i = rightSide; i >= leftSide; i--)
                               System.out.print(spiral[bottomSide][i]);

                       bottomSide--;

                       // Move up
                       for (int i = bottomSide; i >= topSide; i--)
                               System.out.print(spiral[i][leftSide]);

                       leftSide++;
               }
       }
}