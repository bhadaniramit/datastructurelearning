package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class ConvertIntToBit {

    public int[] intToBit(int a) {
        int x = 0;
        int[] bitWise = new int[35];
        while (a > 0) {
            bitWise[x] = a % 2;
            a /= 2;
            x++;
        }
        return printBitwise(bitWise, x);
    }

    int[] printBitwise(int[] bitWise, int toIterate) {
        int[] valuetoRet = new int[4];
        int i;
        if (toIterate < 4) {
            for (i = 0; i < toIterate; ) {
                while (i < 4 - toIterate) {
                    valuetoRet[i] = 0;
                    i++;
                }
                for (int j = 0; j < toIterate; j++) {
                    valuetoRet[i] = bitWise[j];
                    i++;
                }
            }
        }
        return valuetoRet;
    }

    public int[] findXor(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            arr[i] = arr[i] ^ arr[i + 1];
        }
        return arr;
    }

    public int[] addTwoArray(int[] a, int[] b) {
        int findMin = Math.max(a.length, b.length);
        int[] newArray = new int[findMin];
        List<Integer> myList = new ArrayList<>();
        int x = 0;
        try {
            for (int i = 0; i < findMin; i++) {
                int sum = a[i] + b[i];
                newArray[x] = sum;
                x++;
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        } finally {

        }
        return newArray;
    }

    public void largestSubArray(int[] abc, int sum) {
        for (int i = 0; i < abc.length; i++) {
            for (int j = i + 1; j < abc.length; j++) {
                if (abc[i] + abc[j] == sum) {

                }
            }
        }
    }

    public static int findMaxSubarray(int[] nums) {
        // Initialise max and maxTillNow as nums[0]
        int max = nums[0];
        int maxTillNow = nums[0];

        // Loop through the array
        for (int i = 1; i < nums.length; i++) {
            // maxTillNow is max of curr element or maxTillNow + curr element
            maxTillNow = Math.max(nums[i], maxTillNow + nums[i]);
            // max is maximum of max and maxTillNow
            max = Math.max(max, maxTillNow);
        }

        // Return the result
        return max;
    }

    public static void main(String[] args) {
        ConvertIntToBit convertIntToBit = new ConvertIntToBit();
//        System.out.println(Arrays.toString(convertIntToBit.intToBit(3)));
//        System.out.println(Arrays.toString(convertIntToBit.findXor(new int[]{0, 0, 1, 1})));
//        System.out.println(Arrays.toString(convertIntToBit.addTwoArray(new int[]{2, 7, 1, 1, 2, 3, 5, 6}, new int[]{3, 2, 1, 1})));
        System.out.println(convertIntToBit.findMaxSubarray(new int[]{2, -7, 1, 2}));
    }
}
