/*Find the indexes of the initial appearance of the maximum element in a matrix.

Input data format:

On the input, the program receives the size of matrix n and m,
and then n lines having m integer numbers in each n and m do not exceed 100.

Output data format

Output two numbers: the row index and the column index,
in which the greatest item in the two-dimensional array (matrix) is located.
If there are several such elements, output the one, which has the smaller row index;
and if row indexes are the same, output the one having the smaller column index.
*/

import java.util.Scanner;

public class MaximumElementInAnArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int m = scanner.nextInt();

        int[][] twoDimArray = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                twoDimArray[i][j] = scanner.nextInt();
            }
        }
        int max = twoDimArray[0][0];
        int row = 0;
        int column = 0;
        int rowCount = 0;
        for (int[] array : twoDimArray) {
            int columnCount = 0;
            for (int element : array) {
                if (element > max) {
                    max = element;
                    row = rowCount;
                    column = columnCount;
                }
                columnCount++;
            }
            rowCount++;
        }
        System.out.println(row + " " + column);
    }
}
