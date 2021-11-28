import java.util.*;

public class FindSubsequence {

    public void findSub(int a) {


    }

    public String reverseString(String string) {
        String[] strings = string.split("\\s+");
        String result = "";
        for (int i = strings.length - 1; i >= 0; i--) {
            result += strings[i] + " ";
        }
        return result;
    }

    public void findDotProduct(int[] a, int[] b) {
        int result = 0;
        for (int i = 0; i < a.length; i++) {
            result += a[i] * b[i];
        }
        System.out.println(result);
    }

    public void findMissingNumber(int[] a) {
        int sum = 0;
        int expSum = 0;
        Set<Integer> mySet = new HashSet<Integer>();
        TreeSet<Integer> treeSet = new TreeSet<Integer>();
        System.out.print("Repeat int is ");
        for (Integer b : a) {
            if (!treeSet.contains(b)) {
                treeSet.add(b);
            } else {
                System.out.print(b + " ");
            }
        }
        for (Integer abc : treeSet) {
            sum += abc;
        }
        System.out.println();
        System.out.println("Missing Number is ");
        int correct = treeSet.size() + 1;
        for (int i = 1; i <= correct; i++) {
            if (!treeSet.contains(i)) {
                System.out.print(i + " ");
            }
        }
        ArrayList<Integer> myLit = new ArrayList<>();
        myLit.add(200);
        myLit.add(300);
        TreeSet myTreeset = new TreeSet<>(myLit);
        myTreeset.addAll(treeSet);
        System.out.println("New ----------- " + myTreeset);

    }

    public void insertElement(int[] a, int elementToInsert) {
        boolean flag = true;
        List<Integer> newList = new ArrayList<>();
        for (Integer b : a) {
            newList.add(b);
        }
        newList.add(elementToInsert);
        Object[] myarray = newList.toArray();
        Arrays.sort(myarray);
        System.out.println(Arrays.toString(myarray));
    }

    public void converStrngToint(String myString) {
        for (int j = 0; j < myString.length(); j++) {
            int i = myString.charAt(j) - 48;
            System.out.print(i);
        }
    }

    public void longerstString(String myString) {
        HashMap<Character, Integer> myMapa = new HashMap<Character, Integer>();
        Set<Integer> myset = new HashSet<>();
        for (int i = 0; i < myString.length(); i++) {
            if (myMapa.containsKey(myString.charAt(i))) {
                myMapa.put(myString.charAt(i), myMapa.get(myString.charAt(i)) + 1);
            } else {
                myMapa.put(myString.charAt(i), 1);
            }
        }
        for (Map.Entry<Character, Integer> entry : myMapa.entrySet()) {
            myset.add(entry.getValue());
        }
        Object[] arr = myset.toArray();
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int x = (int) arr[arr.length-1];
        System.out.println(x);
    }

    public static void main(String[] args) {
        FindSubsequence findSubsequence = new FindSubsequence();
//        System.out.println(findSubsequence.reverseString("My Name is Ramit Bhadani"));
//        findSubsequence.findDotProduct(new int[]{1, 2}, new int[]{3, 4});
//        findSubsequence.findMissingNumber(new int[]{2, 4, 12, 5, 7, 10, 1, 2, 8, 3, 6, 9, 8, 12, 14, 16, 18, 20, 22, 12, 21, 22, 24});
//        findSubsequence.insertElement(new int[]{12, 16, 70, 20, 40, 50, 75, 70, 75, 79}, 58);
//            findSubsequence.converStrngToint("234567");
        findSubsequence.longerstString("aabbbbddc");
    }
}
