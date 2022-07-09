/** Write a program that reads an array of ints and outputs the length of the longest sequence in strictly
ascending order. Elements of the sequence must go one after another.
A single number is assumed to be an ordered sequence with the length = 1. **/


import java.util.Scanner;
public class LongestAscendingSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arraySize = scanner.nextInt();
        int[] array = new int[arraySize];

        for (int n = 0; n < arraySize; n++) {
            array[n] = scanner.nextInt();
        }

        int longestSequence = 1;
        int currentSequence = 1;

        if (arraySize > 1) {
            for (int i = 0; i < arraySize - 1; i++) {
                if (array[i + 1] > array[i]) {
                    currentSequence++;
                    if (currentSequence > longestSequence) {
                        longestSequence = currentSequence;
                    }
                } else {
                    currentSequence = 1;
                }
            }
        }
        System.out.println(longestSequence);
    }
}
