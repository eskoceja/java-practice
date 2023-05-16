package optional.HashMapProblems;
import java.util.HashMap;

public class FrequencyCounter {
    public static void main(String[] args) {
        int[] nums = {1, 2, 2, 3, 3, 3, 4, 4, 4, 4};

        HashMap<Integer, Integer> frequencyMap = getFrequencyMap(nums);

        System.out.println(frequencyMap);

    }
    public static HashMap<Integer, Integer> getFrequencyMap(int[] nums) {
        HashMap<Integer, Integer> frequencyMap = new HashMap<>();

        for(int num: nums) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }
        return frequencyMap;
    }
}
