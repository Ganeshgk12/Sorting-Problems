package Programs.sorting;

import java.util.Arrays;

public class LargestPerimeterTriangle_976 {
    public static void main(String[] args) {

        int [] num = {2,1,2};
        System.out.println(largestPerimeter(num));
        System.out.println(largestPerimeter2(num)); // optimal
    }
    // Brute
    public static int largestPerimeter(int[] nums) {
        Arrays.sort(nums);
        for(int i = nums.length-1; i >= 2; i--){
            if(nums[i] < nums[i-1]+nums[i-2]){
                return nums[i]+nums[i-1]+nums[i-2];
            }
        }
        return 0;
    }
    //Optimal
    public static int largestPerimeter2(int[] nums) {
    int len = nums.length;
    int a=0,b=0,c=0,n=len-1;
        for(int i=0; i<len; i++){
        int maxIndex = findMax(nums,n);
        swap(nums,maxIndex,n);
        if(len-n>=3){
            a=nums[n];
            b=nums[n+1];
            c=nums[n+2];
            if(a+b>c && b+c>a && a+c>b)    return a+b+c;
        }
        n--;
    }
        return 0;
}
    public static int findMax(int[] nums,int end){
        int max = 0;
        for(int i=0; i<=end; i++)
            if(nums[i]>nums[max]) max=i;
        return max;
    }
    public static void swap(int[] nums,int j,int i){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

}
