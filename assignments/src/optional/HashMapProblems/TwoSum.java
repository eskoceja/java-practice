package optional.HashMapProblems;
import java.util.HashMap;
import java.util.HashSet;

public class TwoSum {
    public static void main(String[] args) {
        int [] arr = {2, 7, 11, 15};
        int target = 9;

        boolean hasTwoSums = hasTwoSum(arr, target);

        System.out.println(hasTwoSums);
    }
    public static boolean hasTwoSum(int[] arr, int target) {
        HashSet<Integer> complementSet = new HashSet<>();

        for(int num: arr) {
            int complement = target - num;
            if(complementSet.contains(complement)) {
                return true;
            }
            complementSet.add(num);
        }
        return false;
    }
}
