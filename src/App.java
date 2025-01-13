/**
 *  Task: Complete the columnRowAddition method. 
 *  
 *  Description: The columnRowAddition method takes in a 2D array along with a row 
 *  AND column index as parameters. The method will return the sum of the specified row and column.
 * 
 *  Basic task (up to B+ level): Complete the method as described above
 *  
 *  Moderate task (up to A level): Complete the method as described AND handle column and row values
 *  that would cause IndexOutOfBoundsException and return a value of -1. For example, if the row input 
 *  value was -5, the columnRowAddition method would return -1. 
 * 
 *  Challenge task (up to A+ level): Complete both of the above AND make sure that every value gets only 
 *  gets added to the sum ONCE. By which I mean, do not double count the value that exists. For example, 
 *  if we have a 3x3 array and the row input is 1 and the column input is 1, then we should sum (1,0) + (1,1)
 *  + (1,2) + (0,1) + (2,1). You'll notice we did not count (1,1) twice because it exists at the intersection.
 *  
 */

public class App {
    public static void main(String[] args) throws Exception {

        int[][] testArray1 = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        // Examples of valid indices
        System.out.println("=== B+ Level Tests ===");
        System.out.println("Row = 1, Col = 1: Expected sum is (4+5+6+2+5+8) = 30");
        System.out.println("Your sum: " + columnRowAddition(testArray1, 1, 1));

        System.out.println("\nRow = 2, Col = 0: Expected sum is (7+8+9+1+4+7) = 36");
        System.out.println("Your sum: " + columnRowAddition(testArray1, 2, 0));

    
        // Example of out-of-bounds
        System.out.println("\n=== A Level Tests ===");
        System.out.println("Row = 0, Col = -1: Expected sum is -1 (out of bounds)");
        System.out.println("Your sum: " + columnRowAddition(testArray1, 0, -1));

        System.out.println("\nRow = testArray1.length, Col = 0: Expected sum is -1 (out of bounds)");
        System.out.println("Your sum: " + columnRowAddition(testArray1, testArray1.length, 0));

        //Examples of not double counting
        System.out.println("\n=== A+ Level Tests ===");
        System.out.println("Row = 1, Col = 1: Expected sum is (4+6+2+5+8) = 25");
        System.out.println("Your sum: " + columnRowAddition(testArray1, 1, 1));

        System.out.println("\nRow = 2, Col = 0: Expected sum is (7+8+9+1+4) = 29");
        System.out.println("Your sum: " + columnRowAddition(testArray1, 2, 0));

       
    
    }


    public static int columnRowAddition(int[][] arr, int row, int col){
        int sum = 0;
        

        for (int i = 0; row < arr.length; row++){
            for (int sumrow = 1;  sumrow < arr[1].length; col++){
                sum += arr[col][1];
            }
        }


        
        
        return sum;
                
    }
}
