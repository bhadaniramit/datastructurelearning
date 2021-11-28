package LeetCode;

public class PalindromeInt {
    //121
    public boolean isPalindrome(int x) {
        int y = 0;
        int origNum = x;
        while (x > 0) {
            y = y * 10 + x % 10;
            x /= 10;
        }
        if (y == origNum) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isStringPalindrom(String abc) {
        char[] myChar = abc.toCharArray();
        String newString = "";
        for (int i = myChar.length - 1; i >= 0; i--) {
            newString = newString + abc.charAt(i);
        }
        if (newString.equals(abc)) {
            return true;
        } else {
            return false;
        }
    }


    public static void main(String[] args) {
        PalindromeInt palindromeInt = new PalindromeInt();
//        System.out.println(palindromeInt.isPalindrome(1331));
        System.out.println(palindromeInt.isStringPalindrom("radar"));
    }
}
