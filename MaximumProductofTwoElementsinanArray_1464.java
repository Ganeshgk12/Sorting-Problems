package Programs.sorting;

public class MaximumProductofTwoElementsinanArray_1464 {
    public static void main(String[] args) {
        int [] arr = {3,4,5,2};
        System.out.println(maxProduct(arr));
    }
    public static int maxProduct(int[] nums) {
        int fMax = 0;
        int sMax = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] > fMax){
                sMax = fMax;
                fMax = nums[i];
            }else if(nums[i] > sMax){
                sMax = nums[i];
            }
        }
        return (fMax -1) * (sMax -1);
    }
}
