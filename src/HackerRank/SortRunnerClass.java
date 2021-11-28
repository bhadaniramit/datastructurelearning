package HackerRank;

import java.util.Arrays;
import java.util.HashMap;

public class SortRunnerClass {

    public void sortJava(String[][] studentDetails) {
        HashMap<String, String> myMap = new HashMap<>();
        for (int i = 0; i < studentDetails.length; i++) {
            for (int j = 1; j < studentDetails[i].length; j++) {
                if (myMap.containsKey(studentDetails[i][0])) {
                    myMap.put(studentDetails[i][j], myMap.get(studentDetails[i][2]));
                } else {
                    myMap.put(studentDetails[i][j], studentDetails[i][2]);
                }
            }
        }
    }


    int missingNumber(int[] array, int n) {
        int tempSum = 0;
        int actualSum = 0;
        for (int i = 0; i < array.length; i++) {
            tempSum += array[i];
        }
        for (int i = 1; i <= n; i++) {
            actualSum += i;
        }
        int missingNumber = actualSum - tempSum;
        return missingNumber;
    }

    static void rotateArr(int arr[], int d, int n) {
        int[] arrayTOMove = new int[d];
        int[] finalArray = new int[n];
        int x = 0;
        int y = 0;
        // add your code here
        for (int i = 0; i < d; i++) {
            arrayTOMove[i] = arr[i];
        }
        for (int j = d; j < n; j++) {
            finalArray[x] = arr[j];
            x++;
        }
        for (; x < n; x++) {
            finalArray[x] = arrayTOMove[y];
            y++;
        }

        System.out.println(Arrays.toString(finalArray));
    }



    public static void main(String[] args) {
        SortRunnerClass sortRunnerClass = new SortRunnerClass();
        String[][] students = {
                {"33", "Rumpa", "3.68" },
                {"85", "Ashis", "3.85" },
                {"56", "Samiha", "3.75" },
                {"19", "Samara", "3.75" },
                {"22", "Fahim", "3.76" }
        };
//        sortRunnerClass.sortJava(students);
//        System.out.println(sortRunnerClass.missingNumber(new int[]{1, 2, 3, 5}, 5));
        rotateArr(new int[]{2,4,6,8,10,12,14,16,18,20}, 3, 10);
    }
}
