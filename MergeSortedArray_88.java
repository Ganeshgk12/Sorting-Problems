package Programs.sorting;

import java.util.Arrays;

public class MergeSortedArray_88 {
    public static void main(String[] args) {
        int [] n1 = {1,2,3,0,0,0};
        int m = 3;
        int [] n2 = {2,5,6};
        int n = 3;
        merge(n1,m,n2,n);
        System.out.println(Arrays.toString(n1));
    }
    public static void merge(int[] nums1, int m, int[] nums2, int n) {

        int lastPos = nums1.length-1;
        while(n > 0 && m > 0){
            if(nums2[n-1] >= nums1[m-1]){
                nums1[lastPos] = nums2[n-1];
                n--;
            }else{
                nums1[lastPos] = nums1[m-1];
                m--;
            }
            lastPos--;

        }
        while(n > 0){
            nums1[lastPos] = nums2[n-1];
            n--;
            lastPos--;
        }
    }
}
