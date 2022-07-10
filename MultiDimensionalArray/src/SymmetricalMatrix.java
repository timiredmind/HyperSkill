import java.util.Scanner;
/*
Given the number n, not exceeding 10, and a matrix of size n × n.

Check whether this matrix is symmetric in relation to the main diagonal.
Output the word “YES”, if it is symmetric and the word “NO” otherwise.

Keep in mind that the main diagonal runs from the top left corner to the bottom right corner.*/

public class SymmetricalMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int[][] matrix = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
        boolean isSymmetrical = true;
        outer:
        for (int x = 0; x < n; x++) {
            for (int y = 0; y < n; y++) {
                if (x == y) {
                    continue;
                } else {
                    if (matrix[x][y] != matrix[y][x]) {
                        isSymmetrical = false;
                        break outer;
                    }
                }
            }
        }
        if (isSymmetrical) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
