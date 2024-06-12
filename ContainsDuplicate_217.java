package Programs.sorting;

import java.util.Arrays;

public class ContainsDuplicate_217 {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4};
        System.out.println(containsDuplicate(arr));
    }
    public static boolean containsDuplicate(int[] nums) {
        int n = nums.length;

        Arrays.sort(nums);

        for(int i = 1; i < n; i++){
            if(nums[i] == nums[i-1]){
                return true;
            }
        }

        return false;
    }
}
