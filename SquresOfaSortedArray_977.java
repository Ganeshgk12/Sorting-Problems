package Programs.sorting;

import java.util.Arrays;

public class SquresOfaSortedArray_977 {
    public static void main(String[] args) {
        int [] nums = {-4,-1,0,3,10};

        System.out.println(Arrays.toString(sortedSquares3(nums)));
    }

    //More optimal
    public static int[] sortedSquares3(int[] nums) { // ---> successfully run in leetcode but this case
                                                              // given wrong in intellij {-7,-3,6,3,11}
                                                             // it should return {9,9,36,49,121}
                                                            // but its return {9,36,9,49,121}
        int[] result = new int[nums.length];
        int left = 0;
        int rigth = nums.length-1;
        int index = nums.length-1;

        while(left <= rigth) {
            int leftPow = (int) Math.pow(nums[left], 2);
            int rigthPow = (int) Math.pow(nums[rigth], 2);

            if(leftPow > rigthPow) {
                result[index] = leftPow;
                left++;
                index--;
            } else {
                result[index] = rigthPow;
                rigth--;
                index--;
            }
        }

        return result;
    }

    // Brute
    public static int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int cnt = 0;
        int [] res = new int[nums.length];
        for (int i = 0; i < n; i++) {
            if (i < n - 1) {
                int minIndex = findMin(nums, i);
                int temp = nums[i];
                nums[i] = nums[minIndex];
                nums[minIndex] = temp;
                res[cnt++] = nums[i]*nums[i];
            }
        }
        res[n-1] = nums[n - 1] * nums[n-1];
        return res;
    }

    public static int findMin(int[] nums, int s) {
        int min = Integer.MAX_VALUE;
        int minIndex = s;
        if (s == nums.length - 1) return s;
        for (int i = s; i < nums.length; i++) {
            if (Math.abs(nums[i]) < Math.abs(min)) {
                min = nums[i];
                minIndex = i;
            }
        }
        return minIndex;
    }


    // optimal

    public static int[] sortedSquares2(int[] nums) {
        for(int i = 0; i < nums.length; i++){
            nums[i] *= nums[i];
        }
        Arrays.sort(nums);
        return nums;
    }
}
