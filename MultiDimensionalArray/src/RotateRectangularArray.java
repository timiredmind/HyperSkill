import java.util.Scanner;
/* Given a rectangle array n×m in size.
Rotate it by 90 degrees clockwise, by recording the result into the new array m×n in size.
*/
public class RotateRectangularArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int m = scanner.nextInt();

        int[][] rectangularArray = new int[n][m];
        for (int x = 0; x < n; x++) {
            for (int y = 0; y < m; y++) {
                rectangularArray[x][y] = scanner.nextInt();
            }
        }



        for (int i = 0; i < m; i++) {
            for (int j = n - 1; j >= 0 ; j--) {
                System.out.print(rectangularArray[j][i] + " ");
            }
            System.out.println();
        }
    }
}
