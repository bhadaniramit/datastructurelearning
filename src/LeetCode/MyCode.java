package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class MyCode {

    public static void main(String[] args) {
        System.out.println("Hello Java");
        MyCode myCode = new MyCode();
        ArrayList<Integer> a = new ArrayList<Integer>();
        ArrayList<Integer> b = new ArrayList<Integer>();
        a.add(1);
        a.add(2);
        a.add(2);
        a.add(3);
        a.add(4);
        a.add(4);
        b.add(3);
        b.add(5);
        b.add(6);
        b.add(7);
        b.add(7);
//        System.out.println(myCode.mergeMethod(a, b));

//        System.out.println(Arrays.toString(myCode.returnArray(new int[]{3,2,2,3}, 3)));

        int[] arr = {-2, -3, 4, -1, -2, 1, 5, -3};

//        int sum = findMaxSum(arr);
        int sum1 = findMaxSumMyDesign(arr);

        System.out.println(sum1);


    }


// a = {1,2,2,3,4,4}
// b = {3,5,6,7,7}

// {1,2,3,4,3,5,6,7}

    // 1. ArrayList<Integer> myList = new ArrayList<>();
// a = {1,1, 2,2,3,4,4} //1
    public List<Integer> mergeMethod(List<Integer> arrayList1, List<Integer> arrayList2) {
//This will merge the 2 List with Duplicates. O/p is : {1,2,2,3,4,4,3,5,6,7,7}
        arrayList1.addAll(arrayList2);
        List<Integer> myList = new ArrayList<>();
        for (Integer itrArrayList : arrayList1) {
            if (!myList.contains(itrArrayList)) {
                myList.add(itrArrayList);
            }
        }
        return myList;
    }

    public int removeElement(int[] nums, int val) {
        int count = 0;
        for (Integer itrNums : nums) {
            if (itrNums != val) {
                count++;
            }
        }
        return count;
    }

    //Merge 2 SubArray and return the Unique value
    public int[] returnArray(int[] nums, int valToRemove) {
        MyCode myCode = new MyCode();
        int expectedLength = myCode.removeElement(nums, valToRemove);
        int[] newArray = new int[expectedLength];
        int x = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != valToRemove) {
                newArray[x] = nums[i];
                x++;
            }
        }
        return newArray;
    }


    private static int findMaxSum(int[] arr) {
        int sum = 0;
        int max = 0;

        for (int i = 0; i < arr.length; i++) {
            sum = Math.max(sum + arr[i], arr[i]);
            max = Math.max(sum, max);
        }
        return max;
    }


    private static int findMaxSumMyDesign(int[] arr) {
        int sum = 0;
        int max = 0;
        int n = 0;
            for (int i = 0; i < arr.length; i++) {
                sum = Math.max(sum+arr[i], arr[i]);
                max = Math.max(sum, max);
            }
//            max = Math.max(sum, max);
        return max;
    }
}
