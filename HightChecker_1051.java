package Programs.sorting;

import java.util.Arrays;

public class HightChecker_1051 {
    public static void main(String[] args) {
        int [] h = {1,1,4,2,1,3};
        System.out.println(heightChecker(h));
    }

    // Optimal
    public static int heightChecker(int[] heights) {
        int[] sorted = new int[101];

        for (int height:heights) {
            sorted[height]++;
        }

        int i = 1;
        int j = 0;
        int count = 0;

        while (j < heights.length) {

            while (sorted[i] == 0) {
                i++;
            }
            sorted[i]--;

            if (heights[j] != i) {
                count++;
            }

            j++;
        }

        return count;
    }

    // Brute
    public static int heightChecker2(int[] heights) {
        int cnt = 0;
        int [] newArr = Arrays.copyOf(heights,heights.length);
        Arrays.sort(newArr);
        for(int i = 0; i < newArr.length; i++){
            if(newArr[i] != heights[i]){
                cnt++;
            }
        }
        return cnt;

    }
}
