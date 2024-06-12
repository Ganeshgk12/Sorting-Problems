package Programs.sorting;

import java.util.Arrays;

public class AssignCookies_455 {
    public static void main(String[] args) {
        int [] g = {4,2,3,1};
        int [] s = {1,2,4};
        System.out.println(findContentChildren(g,s));
    }
    public static int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);

        int n = g.length;
        int m = s.length;

        int i = 0;
        int j = 0;
        int cnt = 0;
        while(i < n && j < m){

            if(g[i] <= s[j]){
                cnt++;
                i++;
                j++;
            }else{
                j++;
            }
        }
        return cnt;
    }
}
