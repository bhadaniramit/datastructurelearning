package AlgoSearchandSort;

import java.util.Arrays;

public class BubbleSort {
    //Concept of Buble Sort : Swap the value

    public void sortBubble(int[] myArray) {
        int temp;
        for (int i = 0; i < myArray.length - 1; i++) {
            if (myArray[i] > myArray[i + 1]) {
                temp = myArray[i];
                myArray[i] = myArray[i + 1];
                myArray[i + 1] = temp;
            }
        }
        System.out.println(Arrays.toString(myArray));
    }

    public static void main(String[] args) {
        BubbleSort sort_bubble = new BubbleSort();
        sort_bubble.sortBubble(new int[]{5, 8, 18, 19, 21, 22, 100, 24,190});
    }
}
