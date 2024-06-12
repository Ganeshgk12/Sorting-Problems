package Programs.sorting;
import java.util.ArrayList;
import java.util.Arrays;

public class FindAllNumbersDisappearedInAnArray_448 {
    public static void main(String[] args) {
        int[] arr = {3,2,3,4,6,5};
        System.out.println(findDisappearedNumbers(arr));
    }

    // optimal ----------
    public static ArrayList<Integer> findDisappearedNumbers(int[] nums) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        int n = nums.length;

        boolean[] check = new boolean[n + 1];

        for (int i = 0; i < n; i++) {
            check[nums[i]] = true;
        }

        for (int i = 1; i <= n; i++) {
            if (!check[i]) list.add(i);
        }
        return list;
    }

    // Better ----------------------

    public static ArrayList<Integer> findDisappearedNumbers2(int[] nums) {
        int n = nums.length;
        int i = 0;

        while (i < n) {

            int correctIndex = nums[i] - 1;
            if (nums[i] <= n && nums[i] != nums[correctIndex]) {
                swap(nums, i, correctIndex);
            } else {
                i++;
            }
        }

        ArrayList<Integer> list = new ArrayList<>();

        for (int index = 0; index < n; index++) {
            if (nums[index] != index + 1) {
                list.add(index + 1);
            }
        }
        return list;
    }

    public static void swap(int[] nums, int i, int correct) {
        int temp = nums[i];
        nums[i] = nums[correct];
        nums[correct] = temp;
    }
}

