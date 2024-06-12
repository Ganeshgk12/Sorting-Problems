package Programs.sorting;
import java.util.Arrays;

public class sortArrayByParityII_922 {
    public static void main(String[] args) {

        int [] arr = {4,2,5,7};
        System.out.println(Arrays.toString(sortArrayByParityII(arr)));
    }
    public static int[] sortArrayByParityII(int[] nums) {
        int[] res = new int[nums.length];
        int even = 0;
        int odd = 1;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] % 2 == 0){
                res[even] = nums[i];
                even += 2;
            }
            else{
                res[odd] = nums[i];
                odd += 2;
            }
        }
        return res;
    }

}
