package LeetCode;

public class LongestCommon {
    public String longestCommonPrefix(String[] strs) {
        String newString = "";
        int minStringLength = findMinLength(strs);
            for (int j = 0; j < minStringLength; j++) {
                char firstStr = strs[0].charAt(j);
                for (int i = 1; i < strs.length; i++) {
                    if (strs[i].charAt(j) != firstStr) {
                        return newString;
                    }
                }

                newString += firstStr;
            }
        if (newString.length() != 0) {
            return newString;
        } else {
            return " ";
        }
    }

    int findMinLength(String[] strs) {
        int min = strs[0].length();
        for (int i = 0; i < strs.length; i++) {
            if (strs[i].length() < min) {
                min = strs[i].length();
            }
        }
        return min;
    }

    public static void main(String[] args) {
        LongestCommon longestCommon = new LongestCommon();
        longestCommon.longestCommonPrefix(new String[]{ });
    }
}
