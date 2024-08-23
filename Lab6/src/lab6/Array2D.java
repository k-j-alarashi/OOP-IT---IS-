package lab6;

public class Array2D {
    public static void main(String[] args) {
        int[][] x = {
            //column = 0  column = 1    column = 2
            {       1       ,2         ,3}, // row = 0
            {       4       ,5         ,6}, // row = 1
            {       7       ,8         ,9}  // row = 2
        };
        
        for (int row = 0; row < x.length; row++) {
            for (int column = 0; column < x[row].length; column++) {
                System.out.print("x["+row+"]["+column+"] = "+x[row][column]+"           ");
            }
            System.out.println();
        }
    }
}
