package exercises.datastructures;

import java.util.Scanner;

import static java.lang.System.in;
import static java.lang.System.out;

public class Subarray {
    public void solve() {
        Scanner scan = new Scanner(in);

        int length = Integer.parseInt(scan.nextLine());

        int[] array = new int[length];
        for (int i = 0; i < length; i++) {
            array[i] = scan.nextInt();
        }

        int negativeSums = 0;
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                int sum = sumFromTo(array, i, j);
                if (sum < 0) {
                    negativeSums++;
                }
            }
        }

        out.println(negativeSums);
    }

    private int sumFromTo(int[] array, int i, int j) {
        int sum = 0;
        for (int k = i; k <= j; k++) {
            sum += array[k];
        }

        return sum;
    }
}
