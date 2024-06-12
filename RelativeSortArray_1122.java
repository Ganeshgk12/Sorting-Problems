package Programs.sorting;

import java.util.Arrays;

public class RelativeSortArray_1122 {
    public static void main(String[] args) {
        int [] arr1 = {2,3,1,3,2,4,6,7,9,2,19};
        int [] arr2 = {2,1,4,3,9,6};
        System.out.println(Arrays.toString(relativeSortArray(arr1,arr2)));
    }
    public static int[] relativeSortArray(int[] arr1, int[] arr2) {

        int n1 = arr1.length;
        int n2 = arr2.length;

        int [] counts = new int [1001];
        int [] res = new int [arr1.length];

        for (int num : arr1) {
            counts[num]++;
        }
        int idx = 0;
        for (int num : arr2) {
            int i = counts[num];
            while (i > 0){
                res[idx++] = num;
                i--;
            }
            counts[num] = 0;
        }

        for (int i = 0; i < 1001; i++) {
            while (counts[i] > 0) {
                res[idx++] = i;
                counts[i]--;
            }
        }
        return res;
    }

    // Brute
    public static int[] relativeSortArray2(int[] arr1, int[] arr2) {
        int index = 0;
        for(int i = 0; i < arr2.length; i++){
            for(int j = 0; j < arr1.length; j++){
                if(arr2[i] == arr1[j]){
                    int temp = arr1[index];
                    arr1[index] = arr1[j];
                    arr1[j] = temp;
                    index++;
                }
            }
        }
        Arrays.sort(arr1,index,arr1.length);

        return arr1;
    }
}
