
public class TwoSum {
    public static void main(String[] args) {
        int[] nums = {2, 4,8,4,7, 11, 15};
        int target = 9;
        int[] result = twoSum(nums, target);
        System.out.println("Indices: " + result[0] + ", " + result[1]);
    }

    public static int[] twoSum(int[] arr ,  int target){
        for(int i=0;i<arr.length ;i++){
            for(int j = i+1; j<arr.length; j++){
                if(arr[i] + arr[j] == target){
                    return new int[]{i, j};
                }
            }
        }

        return new int[]{-1, -1}; // Return -1 if no solution is found

    }
    
}