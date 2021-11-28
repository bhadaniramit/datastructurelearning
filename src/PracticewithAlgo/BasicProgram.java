package PracticewithAlgo;

import java.util.Arrays;
import java.util.Scanner;

public class BasicProgram {
    //How to Read and Print an Integer value in Java

    public void readInt() {
        Scanner scanner = new Scanner(System.in);
        int[] intStorage = new int[5];
        int x = 0;
        for (int i = 1; i <= 5; i++) { //O(n)
            System.out.println("Enter the value of " + i);
            intStorage[x] = scanner.nextInt();
            x++;
        }
        System.out.println("Printing " + Arrays.toString(intStorage));
    }

    //Java Program to Find Factorial of a number
    public int findFactorial(int n) {
        int product = 1;
        if (n <= 1) {
            return n;
        } else {
            while (n != 1) { //O(n)
                product *= n;
                n--;
            }
        }
        return product;
    }

    public static void main(String[] args) {
        BasicProgram basic = new BasicProgram();
//        basic.readInt();
        System.out.println(basic.findFactorial(1));
    }
}
