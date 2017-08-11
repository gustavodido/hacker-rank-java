package exercises.datastructures;

import java.util.Scanner;

public class UnidimensionalArray {

    public void solve() {
        // Given code - Input

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        // Solution

        int[] a = new int[n];

        for(int i = 0 ; i < n; i++){
            int val = scan.nextInt();
            a[i] = val;
        }

        // Given code - Output

        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}
