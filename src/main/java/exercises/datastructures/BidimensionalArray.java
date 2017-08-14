package exercises.datastructures;

import java.util.Scanner;

import static java.lang.Math.max;
import static java.lang.System.in;
import static java.lang.System.out;

public class BidimensionalArray {

    private static final int SIZE = 6;

    public void solve() {
        Scanner scan = new Scanner(in);

        int matrix[][] = new int[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                matrix[i][j] = scan.nextInt();
            }
        }

        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < SIZE - 2; i++) {
            for (int j = 0; j < SIZE - 2; j++) {
                largest = max(sumHourGlass(matrix, i, j), largest);
            }
        }

        out.println(largest);
    }

    private int sumHourGlass(int[][] matrix, int i, int j) {
        return matrix[i][j] + matrix[i][j + 1] + matrix[i][j + 2] +
                matrix[i + 1][j + 1] +
                matrix[i+2][j] + matrix[i + 2][j + 1] + matrix[i + 2][j + 2];
    }
}
