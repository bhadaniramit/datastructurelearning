package HackerRank;

import java.util.*;

public class HackerStringPractice {

    public void lex(String a, String b) {
        int k = 0;
        char[] f = a.toCharArray();
        char[] s = b.toCharArray();
        int len = f.length + s.length;
        int lenOfString = a.length() + b.length();
        System.out.println("Character Length " + len);
        for (int i = 0; i < f.length; i++) {
            for (int j = i; j < s.length; j++) {
                if (a.charAt(i) == b.charAt(j)) {
//                    System.out.println("It is at Same Place");
                    k++;
                    break;

                } else if (a.charAt(i) < b.charAt(j)) {
                    System.out.println("String " + a + "will come first ");
                    break;
                } else {
                    System.out.println("String " + b + " will come first ");
                    break;
                }
            }
        }
    }

    public void HackerOne() {
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();
        System.out.println(A.length() + B.length());
        if (A.charAt(0) > B.charAt(0)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        System.out.println(A.toUpperCase().charAt(0) + A.substring(1, A.length()).concat(" " + B.toUpperCase().charAt(0) + B.substring(1, B.length())));
    }

    public boolean checkAnargram(String a, String b) {
        boolean flag = true;
        char[] afreq = a.toLowerCase().toCharArray();
        char[] bfreq = b.toLowerCase().toCharArray();
        HashMap<Character, Integer> myHashMap = new HashMap<>();
        HashMap<Character, Integer> myHashMap1 = new HashMap<>();
        for (Character firststr : afreq) {
            if (myHashMap.containsKey(firststr)) {
                myHashMap.put(firststr, myHashMap.get(firststr) + 1);
            } else {
                myHashMap.put(firststr, 1);
            }
        }
        for (Character secondstr : bfreq) {
            if (myHashMap1.containsKey(secondstr)) {
                myHashMap1.put(secondstr, myHashMap1.get(secondstr) + 1);
            } else {
                myHashMap1.put(secondstr, 1);
            }
        }
        if (myHashMap.keySet().equals(myHashMap1.keySet())) {
            for (Character my : myHashMap.keySet()) {
                for (Character ny : myHashMap1.keySet()) {
                    if (myHashMap.get(my) != myHashMap1.get(ny) && my == ny) {
                        flag = false;
                        break;
                    }
                }
                if (flag == false) {
                    return false;
                }
            }
        }
        return true;
    }

    public void secondWayAnargram(String a, String b) {
        char[] afre1 = a.toLowerCase().toCharArray();
        char[] bfre1 = b.toLowerCase().toCharArray();
        Arrays.sort(afre1);
        Arrays.sort(bfre1);
        String ab = new String(afre1);
        String bc = new String(bfre1);
        if (ab.equals(bc)) {
            System.out.println("Anagrams");
        } else {
            System.out.println("Not Anagrams");
        }
    }

    public void thirdWay(String a, String b) {
        char[] afreq = a.toLowerCase().toCharArray();
        char[] bfreq = b.toLowerCase().toCharArray();
        if (a.length() != b.length()) {
            System.out.println("Not aba");
        } else {
            for (int i = 0; i < afreq.length; i++) {
                for (int j = 0; j < bfreq.length; j++) {
                    if (a.toLowerCase().charAt(i) == b.toLowerCase().charAt(j)) {
                        b = b.substring(0, j) + b.substring((j + 1));
                        break;
                    }
                }
            }
            if (b.length() == 0) {
                System.out.println("Anar");
            } else {
                System.out.println("Nah");
            }
        }
    }

    public void regMethod(String str) {
        String pattern = "(.*)(\\d+)(.*)";
        String[] a = str.split("\\W+");
        for (String str1 : a) {
            System.out.println(str1);
        }
    }


    public void removeDuplicatefromString(String myString) {
        String result = "";
//        String[] myNewString[];
        String[] myNewString = myString.split(" ");
        for (int i = 0; i < myNewString.length; i++) {
            for (int j = i + 1; j < myNewString.length; j++) {
                if (myNewString[i].toLowerCase().equals(myNewString[j].toLowerCase())) {
//                    result += myNewString[i] + " ";
                    myNewString[j] = "remove";
                }
            }
        }
        for (String mm : myNewString) {
            if (!mm.equals("remove")) {
                result += mm + " ";
            }
        }
        System.out.println(result);
    }


    public void hourGlass(int[][] arr) {
        int sum = 0;
        int x = 0;
        ArrayList<Integer> myList = new ArrayList<Integer>();
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                sum = (arr[i][j]
                        + arr[i][j + 1]
                        + arr[i][j + 2]
                        + arr[i + 1][j + 1]
                        + arr[i + 2][j]
                        + arr[i + 2][j + 1]
                        + arr[i + 2][j + 2]);
                myList.add(sum);
            }
        }
        System.out.println(myList);
        TreeSet<Integer> myTreeSet = new TreeSet<>(myList);
        System.out.println(myTreeSet);
    }

    public static void main(String[] args) {
        HackerStringPractice str = new HackerStringPractice();
//        str.lex("hello", "hella");
//        str.HackerOne();
//        boolean flag = str.checkAnargram("anagramm", "marganaa");
//        System.out.println(flag ? "Anagrams" : "Not Anagrams");
//        str.secondWayAnargram("hello", "Hello");
//        str.thirdWay("anagramm", "marganaa");
/*        str.regMethod("He is a very very " +
                "good boy, " +
                "isnhe?");*/
//        str.removeDuplicatefromString("Sam went went to to to his business");
        int[][] a = {{1, 1, 1, 0, 0, 0},
                {0, 1, 0, 0, 0, 0},
                {1, 1, 1, 0, 0, 0},
                {0, 0, 2, 4, 4, 0},
                {0, 0, 0, 2, 0, 0},
                {0, 0, 1, 2, 4, 0}};
        str.hourGlass(a);

    }
}
