import java.util.*;

public class ArrayPractice {
    //Find Length of Array in Java:

    public int lengthOfArray(int[] a) {
        return a.length;
    }

    //Find the Sum of Array in Java:
    public int sumOfArray(int[] a) {
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }
        return sum;
    }

    //Find the average of an Array:-
    public int AverageOfArray(int[] a) {
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }
        return sum / a.length;
    }

    //Count Even and Odd numbers in an Array:
    public void CountEvenandOddOfArray(int[] a) {
        int sum = 0;
        int evenCount = 0;
        int oddCount = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }
        System.out.println("Even Count in Array is " + evenCount + "  Odd Count is " + oddCount);
    }

    //Put Even and Odd Elements in 2 Separate Arrays
    public void putEvenandOddOfArray(int[] a) {
        int sum = 0;
        int evenCount = 0;
        int oddCount = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }
        int x = 0;
        int y = 0;
        int[] evenCountArray = new int[evenCount];
        int[] oddCountArray = new int[oddCount];
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                evenCountArray[x] = a[i];
                x++;
            } else {
                oddCountArray[y] = a[i];
                y++;
            }
        }
        System.out.println("Even Array is " + Arrays.toString(evenCountArray) + "  Odd Arrays is " + Arrays.toString(oddCountArray));
    }

    //Display Even and Odd numbers in an Array:
    public void displayEvenandOddOfArray(int[] a) {
        int sum = 0;
        int evenCount = 0;
        int oddCount = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                System.out.println("Even " + a[i]);
            } else {
                System.out.println("Odd  " + a[i]);
            }
        }
    }


    //Sum of Even and Odd Numbers in Array in Java:
    public String sumOfevenandoddArray(int[] a) {
        int sumEven = 0;
        int sumOdd = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                sumEven += a[i];
            } else {
                sumOdd += a[i];
            }
        }
        return "Sum of Even is " + sumEven + " sum of Odd is " + sumOdd;
    }

    //Remove odd numbers from an array Java
    public int[] removeoddArray(int[] a) {
        int sumEven = 0;
        int sumOdd = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                sumEven++;
            } else {
                sumOdd++;
            }
        }
        int[] neEvenArray = new int[sumEven];
        int x = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                neEvenArray[x] = a[i];
                x++;
            }
        }
        return neEvenArray;
    }

    //Find the cumulative sum of an array in Java
    public int[] cummilativeSum(int[] a) {
        int x = 0;
        for (int i = 0; i <= a.length - 1; i++) {
            x += a[i];
            a[i] = x;
        }
        return a;
    }

    //Find numbers that are greater than the given number from an array:
    public void greaterKeys(int[] a, int key) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] > key) {
                System.out.println("Greater values are " + a[i]);
            }
        }
    }

    // Find average and numbers greater than average in the array
    public void averageandGreater(int[] a) {
        int sum = 0;
        int average;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }
        average = sum / a.length;
        System.out.println("Average is " + average);
        System.out.println("Average greater ");
        for (int i = 0; i < a.length; i++) {
            if (a[i] > average) {
                System.out.print(a[i] + " ");
            }
        }
    }

    //Sum of Two Arrays Elements:-
    public int[] sumoftwoArray(int[] a, int[] b) {
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            a[sum] = a[i] + b[i];
            sum++;
        }
        return a;
    }

    public int differentoftwoArray(int[] a, int[] b) {
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i] + b[i];
        }
        return sum;
    }

    //Merge 2 Arrays in Java
    public int[] mergeArray(int[] a, int[] b) {
        int x = a.length + b.length;
        int[] newArray = new int[x];
        int counter = 0;
        for (int i = 0; i < a.length; i++) {
            newArray[counter] = a[i];
            counter++;
        }
        for (int j = 0; j < b.length; j++) {
            newArray[counter] = b[j];
            counter++;
        }
        Set<Integer> mySet = new HashSet<Integer>();
        for (Integer mySortedArray : newArray) {
            mySet.add(mySortedArray);
        }
        System.out.println(mySet);
        List<Integer> myList = new ArrayList<>(mySet);
        Collections.sort(myList);
        System.out.println("My Sorted List " + myList);
        Arrays.sort(newArray);
        return newArray;
    }

    //Sort an Array in Java
    public int[] sortArray(int[] a) {
        try {
            for (int i = 0; i < a.length; i++) {
                for (int j = i + 1; j < a.length; j++) {

                    if (a[i] > a[j]) {
                        a[i] = a[i] + a[j];
                        a[j] = a[i] - a[j];
                        a[i] = a[i] - a[j];
                    }
                }
            }
        } catch (NumberFormatException e) {
            System.out.println("Didi");
            return a;
        }
        return a;
    }

    //Reverse an Array in Java:-
    public int[] reverseArray(int[] a) {
        int[] reverseArrayVar = new int[a.length];
        int j = 0;
        for (int i = a.length - 1; i >= 0; i--) {
            reverseArrayVar[j] = a[i];
            j++;
        }
        return reverseArrayVar;
    }

    public void HCF(int[] a) {
        int hcf = a[0];
        for (int i = 1; i < a.length; i++) {
            while (hcf != a[i]) {
                if (hcf > a[i]) {
                    hcf = hcf - a[i];
                } else {
                    a[i] = a[i] - hcf;
                }
            }
        }
        System.out.println(hcf);
    }

    public int factorial(int n) {
        int dot = 1;
        if (n == 1) {
            return 1;
        } else {
            while (n != 0) {
                dot *= n;
                n = n - 1;
            }
            return dot;
        }
    }

    //Liner search
    public void linearSearch(int[] a, int searchKey) {
        boolean flag = false;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == searchKey) {
                System.out.println("Match Found");
                flag = true;
            }
        }
        if (flag == false) {
            System.out.println("No Match found");
        }
    }

    public void binarySearch(int[] a, int keytosearch) {
        Arrays.sort(a);
        int lengthofArray = a.length;
        int low = 0;
        int high = a.length - 1;
        while (low <= high) {
            int mid = (high + low) / 2;
            if (a[mid] == keytosearch) {
                System.out.println(Arrays.toString(a));
                System.out.println("Found the match" + mid);
                break;
            } else if (a[mid] < keytosearch) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }


    }


    //Remove Duplicates From Array:
    public void removeDuplicates(int[] a) {
        ArrayList<Integer> myList = new ArrayList<>();

        System.out.println(Arrays.toString(a));
        int k = 0;
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] != a[i + 1]) {
                a[k] = a[i];
                k++;
            }
        }
        System.out.println(k);
        int[] newArray = new int[k + 1];
        System.out.println("Length of new Array will be " + (k + 1));
        newArray[k++] = a[a.length - 1];
        System.out.println(Arrays.toString(a));
        System.out.println("Original Array");
        for (int i = 0; i < k; i++) {
            System.out.print(a[i] + " ");
        }

    }

    public void findMissingNumber(int[] a) {
        Set<Integer> mySet = new HashSet<>();
        for (Integer arrayToSet : a) {
            if (mySet.contains(arrayToSet)) {
                mySet.add(arrayToSet);
            } else {
                System.out.println("Repeated Element " + arrayToSet);
            }
        }
        TreeSet<Integer> myTreeSet = new TreeSet<>(mySet);
        System.out.println(myTreeSet);
        for (int i = 1; i < myTreeSet.last(); i++) {
            if (!myTreeSet.contains(i)) {
                System.out.print(i + " ");
            }
        }
    }

    public static void main(String[] args) {
        ArrayPractice practice = new ArrayPractice();
//        System.out.println(practice.lengthOfArray(new int[] {10, 20, 30, 40, 50}));
//        System.out.println(practice.sumOfArray(new int[] {10, 20, 30, 40, 50}));
//        System.out.println(practice.AverageOfArray(new int[] {10, 20, 30, 40, 50}));
//        practice.CountEvenandOddOfArray(new int[]{10, 20, 30, 40, 50, 89, 99, 49});
//        practice.putEvenandOddOfArray(new int[]{10, 20, 30, 40, 50, 89, 99, 49});
//        practice.displayEvenandOddOfArray(new int[]{10, 20, 30, 40, 50, 89, 99, 49});
//
//        System.out.println(practice.sumOfevenandoddArray(new int[]{1,2,3,4}));
//        System.out.println(Arrays.toString(practice.removeoddArray(new int[]{10, 20,55,13, 30, 40, 50, 89, 99, 49})));
//        System.out.println(Arrays.toString(practice.cummilativeSum(new int[]{9, 8, 7, 0, -2, 5})));
//        practice.averageandGreater(new int[]{9, 8, 7, 0, -2, 5});
//        practice.greaterKeys(new int[]{-10, 5, 0, -9, 18, 27, -36}, 5);
//        System.out.println(Arrays.toString(practice.sumoftwoArray(new int[]{10, 20}, new int[]{10, 20})));
//        System.out.println(practice.differentoftwoArray(new int[]{-10, -20}, new int[]{-10, Integer.parseInt("String")}));
//        System.out.println(Arrays.toString(practice.mergeArray(new int[]{10, 20, 30, 40, 50, 90, 12, 15, 18, 9, 27}, new int[]{9, 18, 27, 36, 45})));
//        System.out.println(Arrays.toString(practice.reverseArray(new int[]{10, 20, 30, 40, 50, 90, 12, 15, 18, 9, 27})));
//        System.out.println(Arrays.toString(practice.sortArray(new int[]{10, -2, Integer.parseInt("Ramit")})));
//        practice.HCF(new int[]{50, 10, 100, 200});
//        System.out.println(practice.factorial(8));
//        practice.binarySearch(new int[]{10, 20, 30, 40, 50, 90, 12, 15, 18, 9, 27, 8}, 27);
//        practice.removeDuplicates(new int[]{10, 20, 30, 40, 50, 90, 12, 15, 18, 9, 27, 8, 8, 27, 10, 106, 105});
//        practice.removeDuplicates(new int[]{10, 10, 20, 20, 30, 30, 40, 50, 89, 89, 99, 99});

//        practice.findMissingNumber(new int[]{2, 4, 12, 5, 7, 10, 1, 2, 8, 3, 6, 9, 8, 12, 14, 16, 18, 20, 22, 12, 21, 22, 24});
    }
}
