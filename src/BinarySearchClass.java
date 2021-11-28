/**
 * Best among other search Algo. There are 2 types of search Algo
 * 1. Binary Search => Low + (High - Low)/2
 * Condition for Binary Search => It should have a sorted array
 * 2. Linear Search
 */
public class BinarySearchClass {

    public void binarysearchMethod(int[] myArray, int keyToSearch) {
        int low = 0;
        boolean flag = false;
        int high = myArray.length - 1;
        while (low <= high) {
            int mid = (high + low) / 2;
            if (myArray[mid] == keyToSearch) {
                System.out.println("Element Found ..");
                flag = true;
                break;
            }
            if (myArray[mid] < keyToSearch) {
                low = mid + 1;
            }
            if (myArray[mid] > keyToSearch) {
                high = mid - 1;
            }

        }
        if (flag == false) {
            System.out.println("Element not found");
        }

    }







    public static void main(String[] args) {
        BinarySearchClass binarySearchClass = new BinarySearchClass();
        binarySearchClass.binarysearchMethod(new int[]{10, 15, 17, 19, 23, 47, 58, 69, 75}, 16);
    }
}
