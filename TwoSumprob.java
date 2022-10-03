package practice;

import java.util.Arrays;

public class TwoSumprob {
    public static void main(String[] args) {
        int[] array = {1,2,3,4};
        System.out.println(Arrays.toString(twoSum(array, 5)));
    }
    public static int[] twoSum(int[] nums, int target) {
        int i ;
        for ( i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if (nums[j]   == target - nums[i]) {
                    return new int[]{i, j};

                }

            }
        }


    return new int[]{-1,-1};
    }
}
