package AlgoSearchandSort;

import java.util.Arrays;

public class BinarySearch {

    //Concept for Binary Search: It should always be sorted

    public void searchBinary(int[] myArray, int key) {
        Arrays.sort(myArray);
        int low = 0;
        int high = myArray.length - 1;
        int mid;
        while (low <= high) {
            mid = (high + low) / 2;
            if (myArray[mid] == key) {
                System.out.println("Match Found");
                break;
            } else if (myArray[mid] > key) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
    }

    public static void main(String[] args) {
        BinarySearch search_binary = new BinarySearch();
        search_binary.searchBinary(new int[]{5, 8, 18, 19, 21, 22, 100, 24}, 24);
    }
}
