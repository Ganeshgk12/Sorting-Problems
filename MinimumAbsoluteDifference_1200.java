package Programs.sorting;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
public class MinimumAbsoluteDifference_1200 {
    public static void main(String[] args) {

        int [] arr = {3,8,-10,23,19,-4,-14,27};
        System.out.println(minimumAbsDifference(arr));
    }
    // optimal-------------------
    public static List<List<Integer>> minimumAbsDifference2(int[] arr) {
        List<List<Integer>> list = new ArrayList<>();
        int diff = 0;
        int min = Integer.MAX_VALUE;
        Arrays.sort(arr);
        for (int i = 1; i < arr.length; i++) {
            diff = arr[i] - arr[i - 1];
            if (diff < min) {
                min = diff;
            }
        }

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] - arr[i - 1] == min) {
                List<Integer> ans = new ArrayList<>();
                ans.add(arr[i - 1]);
                ans.add(arr[i]);
                list.add(ans);
            }
        }
        return list;
    }

    // Brute------------
    public static ArrayList<ArrayList<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        int previousMin = Integer.MAX_VALUE;
        int point1 = 0;
        int point2 = 0;

        for (int i = 0; i < arr.length - 1; i++) {

            int min = Math.abs(arr[i] - arr[i + 1]);

            if (min < previousMin) {
                previousMin = min;
                point1 = arr[i];
                point2 = arr[i + 1];
            }
        }
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();

        for (int i = 0; i < arr.length - 1; i++) {

            if (Math.abs(arr[i] - arr[i + 1]) == previousMin) {
                ArrayList<Integer> list = new ArrayList<>();
                list.add(arr[i]);
                list.add(arr[i + 1]);
                ans.add(list);
            }
        }

        if (ans.size() == 0) {
            ArrayList<Integer> list = new ArrayList<>();
            list.add(point1);
            list.add(point2);
            ans.add(list);
            return ans;
        }

        return ans;
    }
}

