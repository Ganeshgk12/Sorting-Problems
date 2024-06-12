package Programs.sorting;

import java.util.Arrays;

public class SortArrayByParity_905 {
    public static void main(String[] args) {
        int [] arr = {7,2,3,1,4,5};
        System.out.println(Arrays.toString(sortArrayByParity(arr)));
    }
    public static int[] sortArrayByParity(int[] nums) {
        int cnt = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] % 2 == 0){
                swap(nums,i,cnt);
                cnt++;
            }
        }
        return nums;
    }
    public static void swap(int [] nums,int f,int s){
        int temp = nums[f];

        nums[f] = nums[s];
        nums[s] = temp;
    }
}
