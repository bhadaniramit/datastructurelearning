package PracticewithAlgo;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ArrayBasic {

    //Check if a value is present in an Array in Java
    public boolean checkValue(int[] myArray, int key) {
        List myList = Arrays.asList(myArray);
        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] == key) {
                return true;
            }
        }
        return false;
    }

    //Java Program to find largest element in an array
    public int findLargest(int[] findLargest) {
        int sum = findLargest[0];
        for (int i = 0; i < findLargest.length; i++) {
            if (findLargest[i] > sum) {
                sum = findLargest[i];
            }
        }
        return sum;
    }

    //Remove duplicates from sorted array
    public void findDuplicates(int[] myArray) {
        int[] myNewArray = new int[myArray.length];
        int x = 0;
        for (int i = 0; i < myArray.length - 1; i++) {
            if (myArray[i] != myArray[i + 1]) {
                myNewArray[x] = myArray[i];
                x++;
            }
        }
        System.out.println(Arrays.toString(myNewArray));
    }

    //Remove duplicates from Unsorted array using HashMap
    public void removeDuplicates(int[] myArray) {
        Map<Integer, Integer> myMap = new HashMap<>();
        for (Integer itrArray : myArray) {
            if (!myMap.containsKey(itrArray)) {
                myMap.put(itrArray, myMap.get(itrArray));
            }
        }
        myMap.forEach((k, v) -> {
            if (k < 1) {
                System.out.println(k);
            }
        });
    }

    public static void main(String[] args) {
        ArrayBasic basic = new ArrayBasic();
//        System.out.println(basic.checkValue(new int[]{5, 1, 1, 9, -7, 2, 6, 10}, -7));
//        System.out.println(basic.findLargest(new int[]{5, 1, 1, 9, -7, 2, 6, 10}));
//        basic.findDuplicates(new int[]{5, 1, -7, 12, 9, 9, -7, 2, 6, 10, 10, 5});
        basic.removeDuplicates(new int[]{5, 1, -7, 12, 12});
    }
}
