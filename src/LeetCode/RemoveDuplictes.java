package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveDuplictes {
    ArrayList<Integer> list = new ArrayList<>();

    public int removeDuplicates(int[] nums) {
        int j = 0;
        int[] abc = new int[nums.length];
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] != nums[i + 1]) {
                abc[j] = nums[i];
                j++;
            }
        }
        abc[j++] = nums[nums.length - 1];
        return j;
    }

    public int[] printArray(int[] nums) {
        RemoveDuplictes removeDuplictes = new RemoveDuplictes();
        int finalCount = removeDuplictes.removeDuplicates(nums);
        int[] myNewArray = new int[finalCount];
        for (int i = 0; i < finalCount; i++) {
            myNewArray[i] = list.get(i);
        }
        return myNewArray;
    }

    public static void main(String[] args) {
        RemoveDuplictes removeDuplictes = new RemoveDuplictes();
//        System.out.println(Arrays.toString(removeDuplictes.printArray(new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 3})));
        int[][] abc = {{1,1,1,1,0},
                {1,1,0,1,0},
                {1,1,0,0,0},
                {0,0,0,0,0}};
        System.out.println(removeDuplictes.countIsland(abc));
    }

    public int countIsland(int[][] myInput) {
        int count =0;
        for (int i = 0; i < myInput.length-1; i++) {
            for (int j = 0; j < myInput[i].length-1; j++) {
                if (myInput[i][j] == 1) {
                    if(myInput[i][j+1] == 0 || myInput[i][j+2] ==0 || myInput[i][j+3]==0 || myInput[i][j+4] ==0 &&
                    myInput[i+1][j]==0){
                        count++;
                        break;
                    }
                }
            }
        }
        return count;
    }
}
