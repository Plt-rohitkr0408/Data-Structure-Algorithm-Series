package Array;

public class RotateNintyDegree {
    public static void main(String[] args) {
        int[][] arr = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };

        

        int row = arr.length;
        int col = arr[0].length;
        int[][] res = new int[row][col];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        

        System.out.println(res.length +" "+ res[0].length);

        int colm = col -1;
        for (int i = 0; i < res.length; i++) {
            int c = colm;
            for (int j = 0; j < res[0].length; j++) {
               res[j][c] = arr[i][j];
            }

            colm -=1;
        }
        System.out.println();

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(res[i][j] + " ");
            }
            System.out.println();
        }


        

        


    }
}