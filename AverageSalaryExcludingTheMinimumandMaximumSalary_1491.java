package Programs.sorting;

public class AverageSalaryExcludingTheMinimumandMaximumSalary_1491 {
    public static void main(String[] args) {
        int [] salary = {4000,3000,1000,2000};
        System.out.println(average(salary));
    }
    public static double average(int[] salary) {
        double total=0;
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for(int i:salary){
            if(i>max) {
                max=i;
            }
            if(i<min) {
                min=i;
            }
        }
        for(int i:salary) {
            if(i!=max && i!=min) {
                total= total+i;
            }
        }
        return total/(salary.length-2);
    }
}
