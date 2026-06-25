
package TWOD_ARRAY;

public class Spiral_Matrix {
    public static void main(String[] args) {

        System.out.println("-------------------SPIRAL MATRIX-------------------");

        int[][] arr = new int[4][4];

        int number = 1;
        int right = 0;
        int left = 3;
        int top = 0;
        int bottom = 3;

        while (right < left && top <= bottom) {
            for (int i = top; i <= bottom; i++) {
                arr[right][i] = number++;
            }
            right++;
            for (int j = right; j <= left; j++) {
                arr[j][bottom] = number++;
            }
            bottom--;

            for (int k = bottom; k >= top; k--) {
                arr[left][k] = number++;
            }
            left--;

            for (int l = left; l >= right; l--) {
                arr[l][top] = number++;
            }
            top++;

        }

        for (int i = 0; i < arr.length; i++) {
            for (int a = 0; a < arr[0].length; a++) {
                System.out.print(arr[i][a] + "   ");
            }
            System.out.println();
        }
    }

}