package Programs.sorting;

//Given an array of integers nums, sort the array in increasing order based on the frequency of the values.
// If multiple values have the same frequency, sort them in decreasing order.
//Return the sorted array.

import java.util.Arrays;

public class SortArrayByIncreasingFrequency_1636 {
    public static void main(String[] args) {
        int [] nums = {1,1,2,2,2,3};
        System.out.println(Arrays.toString(frequencySort(nums)));
    }
    public static int[] frequencySort(int[] nums) {
        int[] res = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            int count = 0;
            for(int j=0;j<nums.length;j++){
                count += nums[i]==nums[j] ? 1:0;
            }
            res[i]=count;
        }
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(res[i]>res[j]){
                    int temp = res[i];
                    res[i]=res[j];
                    res[j]=temp;

                    int t = nums[i];
                    nums[i]=nums[j];
                    nums[j]=t;
                }
                else if(res[i]==res[j]){
                    if(nums[i]<nums[j]){
                        int c=nums[i];
                        nums[i]=nums[j];
                        nums[j]=c;
                    }
                }
            }
        }
        return nums;
    }
}
