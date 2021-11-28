import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GeeksForGeeks {
    // Java Program to Swap Two Numbers
    public void swapNumber() {
        int a = 59;
        int b = 89;
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println(a + " " + b);
    }

    public void factorial() {
        int num = 6;
        int result = 1;
        while (num != 1) {
            result *= num;
            num = num - 1;
        }
        System.out.println(result);
    }

    //0 1 1 2 3 5
    public void fibonniciSeries(int n) {
        int n1 = 0;
        int n2 = 1;
        int sum = 0;
        System.out.print(n1 + " " + n2);
        for (int i = 2; i < n; i++) {
            sum = n1 + n2;
            System.out.print(" " + sum);
            n1 = n2;
            n2 = sum;
        }
    }

    public void convertListToIntVV(List<Integer> myList) {
        int[] listToArray = new int[myList.size()];
        for (int i = 0; i < myList.size(); i++) {
            listToArray[i] = myList.get(i);
        }
        System.out.println("This is List to Array " + Arrays.toString(listToArray));
        ArrayList<Integer> myListing = new ArrayList<Integer>();
        for (Integer itrArray : listToArray) {
            myListing.add(itrArray);
        }
        System.out.println("Printing Array to List " + myListing);
    }

    public void SubSetofArray(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }

    //Subset of String
    public void subSetofString(String str) {
        int totalOut = str.length() * (str.length() + 1) / 2;
        System.out.println(totalOut);
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < str.length(); i++) {
            for (int j = i; j < str.length(); j++) {
                sb.append(str.substring(i, j + 1) + ", ");
            }
        }
        System.out.println(sb);
    }

    //Subset of Integer
        /*public void subsetOfInteger(){
        // Utility function to print array
        // arr[0..n-1]
        static void printArr(int arr[], int n)
        {
            for (int i = 0; i < n; i++)
                System.out.printf("%d ", arr[i]);

            System.out.println("");
        }

        // Recursive Function to generate all
        // non-increasing sequences with sum x
        // arr[] --> Elements of current sequence
        // curr_sum --> Current Sum
        // curr_idx --> Current index in arr[]
        static void generateUtil(int x, int arr[],
                                 int curr_sum, int curr_idx)
        {

            // If current sum is equal to x, then
            // we found a sequence
            if (curr_sum == x)
            {
                printArr(arr, curr_idx);
                return;
            }

            // Try placing all numbers from 1 to
            // x-curr_sum at current index
            int num = 1;

            // The placed number must also be
            // smaller than previously placed
            // numbers and it may be equal to
            // the previous stored value, i.e.,
            // arr[curr_idx-1] if there exists
            // a previous number
            while (num <= x - curr_sum &&
                    (curr_idx == 0 ||
                            num <= arr[curr_idx - 1]))
            {

                // Place number at curr_idx
                arr[curr_idx] = num;

                // Recur
                generateUtil(x, arr, curr_sum+num,
                        curr_idx + 1);

                // Try next number
                num++;
            }
        }

        // A wrapper over generateUtil()
        static void generate(int x)
        {

            // Array to store sequences on by one
            int arr[] = new int [x];
            generateUtil(x, arr, 0, 0);
        }

        // Driver program
    }*/

    public void SortTwoD(int[][] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length-1; j++) {
                if (a[i][j] > a[i][j + 1]) {
                    a[i][j] = a[i][j] + a[i][j + 1];
                    a[i][j + 1] = a[i][j] - a[i][j + 1];
                    a[i][j] = a[i][j] - a[i][j + 1];
                }
            }
        }
    }


    public static void main(String[] args) {
        GeeksForGeeks geeksForGeeks = new GeeksForGeeks();
//        geeksForGeeks.swapNumber();
//        geeksForGeeks.factorial();
//        geeksForGeeks.fibonniciSeries(16);
        ArrayList<Integer> myList = new ArrayList<>();
        myList.add(10);
        myList.add(10);
        myList.add(20);
        myList.add(30);
        myList.add(40);
        myList.add(50);
//        geeksForGeeks.convertListToIntVV(myList);
//        geeksForGeeks.subSetofString("RAMIT");
        int[][] a = {{1, 1, 1, 0, 0, 0},
                {0, 1, 0, 0, 0, 0},
                {1, 1, 1, 0, 0, 0},
                {0, 0, 2, 4, 4, 0},
                {0, 0, 0, 2, 0, 0},
                {0, 0, 1, 2, 4, 0},
                {0, 0, 1, 2, 4, 0}};
        geeksForGeeks.SortTwoD(a);
    }

}
