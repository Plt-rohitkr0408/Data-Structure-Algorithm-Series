package Array;

public class SortZeroAndOne {
    public static void main(String[] args) {
        int arrr[] = { 0, 1, 0, 1, 0, 1 };
        int n = arrr.length;

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                if (arrr[i] > arrr[j]) {
                    int temp = arrr[i];
                    arrr[i] = arrr[j];
                    arrr[j] = temp;
                }
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.print(arrr[i] + " ");
        }
    }

}
