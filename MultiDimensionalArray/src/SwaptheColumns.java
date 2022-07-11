import java.util.Scanner;
/*Given a two-dimensional array (matrix) and the two numbers: i and j.
Swap the columns with indexes i and j within the matrix.

Input contains matrix dimensions n and m, not exceeding 100,
then the elements of the matrix, then the indexes i and j. */

public class SwaptheColumns {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        int[][] twoDimArray = new int[n][m];
        for (int x = 0; x < n; x++) {
            for (int y = 0; y < m; y++) {
                twoDimArray[x][y] = scanner.nextInt();
            }
        }

        int i = scanner.nextInt();
        int j = scanner.nextInt();

        for (int[] array : twoDimArray) {
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }

        for (int[] intArray : twoDimArray) {
            for (int number: intArray) {
                System.out.print(number + " ");
            }
            System.out.println();
        }
    }
}
