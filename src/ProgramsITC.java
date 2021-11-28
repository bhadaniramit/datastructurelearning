import java.util.*;

public class ProgramsITC {

    //Given a string, we need to find the number of occurrences of each character in that string.
    public void findOccurence(String givenString) {
        char[] myChar = givenString.toCharArray();
        Map<Character, Integer> myMap = new HashMap<Character, Integer>();
        for (Character itrChar : myChar) {
            if (myMap.containsKey(itrChar)) {
                myMap.put(itrChar, myMap.get(itrChar) + 1);
            } else {
                myMap.put(itrChar, 1);
            }
        }
        for (Map.Entry<Character, Integer> entry : myMap.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }

    /**
     * *  1) Given a list of words, group them by anagrams
     * *     Input: List of "cat", "dog", "god"
     * Output: A Set of Sets of anagrams: {{'cat'}, {'dog', 'god'}}
     *
     * @param
     */

    public void anargamList(List<String> listAnargram) {
        String result = "";

        HashMap<String, List<String>> myMergedMap = new HashMap<String, List<String>>();
        for (int i = 0; i < listAnargram.size(); i++) {
            String newString = new String(listAnargram.get(i)); //Store the first list
            char[] newCharWord = newString.toLowerCase().toCharArray(); //Array of first list of string
            Arrays.sort(newCharWord); //Sort the String
            String sortedString = new String(newCharWord); //Store the Sorted String in New String
            if (myMergedMap.containsKey(sortedString)) {
                myMergedMap.get(sortedString).add(newString);
            } else {
                ArrayList<String> myList = new ArrayList<>();
                myList.add(newString.toLowerCase());
                myMergedMap.put(sortedString, myList);
            }
        }
        System.out.println(myMergedMap);
        for(String mySortedMap : myMergedMap.keySet()){
            System.out.println(myMergedMap.get(mySortedMap));
        }
    }


    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList<List<String>>();

        HashMap<String, ArrayList<String>> map = new HashMap<String, ArrayList<String>>();
        for (String str : strs) {
            char[] arr = new char[26];
            for (int i = 0; i < str.length(); i++) {
                arr[str.charAt(i) - 'a']++;
            }
            String ns = new String(arr);

            if (map.containsKey(ns)) {
                map.get(ns).add(str);
            } else {
                ArrayList<String> al = new ArrayList<String>();
                al.add(str);
                map.put(ns, al);
            }
        }

        result.addAll(map.values());

        return result;
    }

    public void sortString(String myString) {
        char[] newWord = myString.toCharArray();
        for (int i = 0; i < newWord.length; i++) {
            for (int j = i + 1; j < newWord.length; j++) {
                if (newWord[i] > newWord[j]) {

                }
            }
        }
    }

    public static void main(String[] args) {
        ProgramsITC solution = new ProgramsITC();
//        solution.findOccurence("aaabbccd");
        ArrayList<String> myInputList = new ArrayList<>();
        myInputList.add("Cat");
        myInputList.add("god");
        myInputList.add("dog");
        myInputList.add("eat");
        myInputList.add("tea");
        myInputList.add("tan");
        myInputList.add("ate");
        myInputList.add("nat");
        myInputList.add("bat");
        solution.anargamList(myInputList);
//        System.out.println(solution.groupAnagrams(new String[]{"eat", "tea", "tan", "ate", "nat", "bat"}));
    }
}
