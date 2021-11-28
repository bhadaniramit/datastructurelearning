package LeetCode;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {

    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> myMap = new HashMap<>();
        for (int j = 0; j < nums.length; j++) {
            int difference = target - nums[j];
            if (myMap.containsKey(nums[j])) {
                return new int[]{myMap.get(nums[j]),j};
            } else {
                myMap.put(difference, j);
            }
        }
        return new int[]{0, 0};
    }

    public static void main(String[] args) {
        TwoSum twoSum = new TwoSum();
        System.out.println(Arrays.toString(twoSum.twoSum(new int[]{3, 3}, 6)));
    }
}
