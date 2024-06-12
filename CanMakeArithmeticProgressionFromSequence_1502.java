package Programs.sorting;

import java.util.Arrays;

public class CanMakeArithmeticProgressionFromSequence_1502 {
    public static void main(String[] args) {
        int [] arr = {3,5,1};
        System.out.println(canMakeArithmeticProgression(arr));
    }
    public static boolean canMakeArithmeticProgression(int[] arr) {
            Arrays.sort(arr);
            int difference = arr[1] - arr[0];
            for(int i = 2; i < arr.length; i++){
                if(arr[i] - arr[i-1] != difference){
                    return false;
                }
            }
            return true;
        }
}

