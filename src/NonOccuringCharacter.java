import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class NonOccuringCharacter {

    public void myCharacter(String myString) {
        char[] myChar = myString.toLowerCase().toCharArray();
        HashMap<Character, Integer> myMap = new HashMap<Character, Integer>();
        List myList = new ArrayList();
        int count = 0;
        int i;
        for (i = 0; i < myChar.length; i++) {
            if (myMap.containsKey(myChar[i])) {
                myMap.put(myChar[i], myMap.get(myChar[i])+1);
            } else {
                myMap.put(myChar[i], 1);
            }
        }
        for(Object myItrMap : myMap.keySet()){
            if(myMap.get(myItrMap) ==1){
                myList.add(myItrMap);
            }
        }
        int[] myarray = new int[myList.size()];
        for(Object myListOfChar : myList){
            int myNewString = myString.indexOf(myListOfChar.toString());
            myarray[count] = myNewString;
            count++;
        }
        Arrays.sort(myarray);
        System.out.println(myString.charAt(myarray[0]));
    }

    public static void main(String[] args) {
        NonOccuringCharacter nonOccuringCharacter = new NonOccuringCharacter();
        nonOccuringCharacter.myCharacter("ramitbhadani");
    }
}
