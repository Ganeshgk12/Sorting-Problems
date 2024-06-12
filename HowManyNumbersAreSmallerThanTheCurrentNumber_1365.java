package Programs.sorting;

import java.util.Arrays;

public class HowManyNumbersAreSmallerThanTheCurrentNumber_1365 {
    public static void main(String[] args) {
        int [] nums = {8,1,2,2,3};
        System.out.println(Arrays.toString(smallerNumbersThanCurrent(nums)));
    }

    public static int[] smallerNumbersThanCurrent(int[] nums) {

        int [] counts = new int[101];
        int [] res = new int[nums.length];

        for (int x : nums) {
            counts[x]++;
        }
        for (int i = 1; i < counts.length; i++) {
            counts[i] += counts[i - 1];
        }
        int idx = 0;

        for (int y : nums) {
            if (y == 0) {
                res[idx++] = 0;
            }
            else {
                res[idx++] = counts[y - 1];
            }
        }
        return res;
    }

}
