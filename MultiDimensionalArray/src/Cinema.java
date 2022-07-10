import java.util.Scanner;

/* The cinema has n rows, each row consists of m seats (n and m do not exceed 20).
A two-dimensional matrix stores the information on the sold tickets:
the number 1 means that the ticket for this place is already sold,
and the number 0 means that the place is available.
You want to buy k tickets to neighboring seats in the same row. Find whether it can be done.
*/

public class Cinema {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt(); //Read the number of rows
        int m = scanner.nextInt(); // Read number of seats

        int[][] seatLocation = new int[n][m]; // create an array for storing if seat is available or not
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                seatLocation[i][j] = scanner.nextInt();
            }
        }

        int k = scanner.nextInt(); // Read number of neighbouring ticket
        int row = 0;
        aa:
        for (int x = 0; x < n; x++) {
            for (int y = 0; y < m - (k - 1); y++) {
                int count = 0;
                for ( int z = y; z < y + k; z++) {
                    if (seatLocation[x][z] != 0) { // Check if seat number is 0
                        break;
                    } else {
                        count++;
                    }
                }
                if (count == k) {
                    row = x + 1;
                    break aa;
                }
            }
        }
        System.out.println(row);
    }
}
