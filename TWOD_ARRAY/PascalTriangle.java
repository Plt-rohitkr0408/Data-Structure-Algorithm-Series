package TWOD_ARRAY;

import java.util.*;

public class PascalTriangle {
    public static void main(String[] args) {
        int number = 30;
        // List<List<Integer> resu = new ArrayList<>();
        for (int i = 1; i <= number; i++) {
            // List<Integer> temp = new ArrayList<>();
            for (int j = 1; j <= i; j++) {
                int row = i - 1;
                int col = j - 1;
                // List<Integer> temp = new ArrayList<>();
                if (row <= 0 || col <= 0) {
                    System.out.print(1 + " ");
                    // temp.add(1);
                } else {
                    int res = 1;
                    for (int k = 0; k < col; k++) {
                        res = res * (row - k);
                        res = res / (k + 1);
                    }
                    System.out.print(res + " ");
                    // temp.add(res);
                }

            }
            System.out.println();
            // resu.add(temp);
        }
    }
}
