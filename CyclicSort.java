package Programs.sorting;

import java.util.Arrays;

public class CyclicSort {
    public static void main(String[] args) {
        int [] nums = {0,2,4,3,1,5,6,7};
        System.out.println(Arrays.toString(cyclicSort(nums)));//--------> Sorting using cyclic sort
        int [] nums2 = {0,2,3,5,4,6,7};
        System.out.println(missingNumber(nums2)); //---------> to find missing number
    }
    public static int missingNumber(int[] nums) {
        int i = 0;
        int n = nums.length;
        while(i < n){
            int correctIndex = nums[i];
            if(nums[i] < n && nums[i] != nums[correctIndex]){
                swap(nums,i,correctIndex);
            }else{
                i++;
            }
        }
        for(int index = 0; index < n; index++){
            if(nums[index] != index){
                return index;
            }
        }
        return n;
    }

    public static int[] cyclicSort(int[] nums) {
        int i = 0;
        int n = nums.length;
        while(i < n){
            int correctIndex = nums[i];
            if(nums[i] < n && nums[i] != nums[correctIndex]){
                swap(nums,i,correctIndex);
            }else{
                i++;
            }
        }
        return nums;
    }
    public static void swap(int [] arr, int first,int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
