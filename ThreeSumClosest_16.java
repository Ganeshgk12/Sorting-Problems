package Programs.sorting;

import java.util.Arrays;

public class ThreeSumClosest_16 {
    public static void main(String[] args) {

        int [] arr = {-1,2,1,-4};
        int target = 1;

        System.out.println(threeSumClosest(arr,target));
    }

    public static int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int closestSum = nums[0] + nums[1] + nums[2];

        for (int i = 0; i < nums.length - 2; i++) {

            int j = i + 1;
            int k = nums.length - 1;

            while (j < k) {

                int sum = nums[i] + nums[j] + nums[k];

                if (Math.abs(target - sum) < Math.abs(target - closestSum)) {
                    closestSum = sum;
                }

                if (sum < target) {
                    j++;
                } else {
                    k--;
                }
            }
        }

        return closestSum;
    }
}

