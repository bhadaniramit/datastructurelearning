import java.util.Arrays;
import java.util.HashMap;

public class InterviewQustion {


    public int myString(String[][] strings) {
        HashMap myMap = new HashMap();
        HashMap<String, Integer> counterForExam = new HashMap<String, Integer>();

        int[] students = new int[strings.length];
        for (int i = 0; i < strings.length; i++) {
            for (int j = 1; j < strings[i].length; j++) {
                if (myMap.containsKey(strings[i][0])) {
                    myMap.put(strings[i][0],
                            Integer.parseInt(String.valueOf(myMap.get(strings[i][0]))) +
                                    Integer.parseInt(String.valueOf(strings[i][j])));
                    counterForExam.put(strings[i][0], counterForExam.get(strings[i][0]) + 1);
                } else {
                    myMap.put(strings[i][0], strings[i][j]);
                    counterForExam.put(strings[i][0], 1);
                }
            }
        }
        System.out.println(myMap);
        System.out.println(counterForExam);
        int[] marks = new int[myMap.size()];
        int i = 0;
        for (Object entry : myMap.keySet()) {
            for (Object entry1 : counterForExam.keySet()) {
                if (entry.equals(entry1)) {
                  marks[i] = Integer.parseInt(String.valueOf(myMap.get(entry))) /counterForExam.get(entry1);
                  i++;
                }
            }

        }
        Arrays.sort(marks);
        System.out.println(Arrays.toString(marks));
        return marks[marks.length-1];
    }

    public static void main(String[] args) {
        InterviewQustion interviewQustion = new InterviewQustion();
        String[][] salutation = {
                {"Ramit ", "100"},
                {"Ramit ", "50"},
                {"Ramit ", "60"},
                {"Ramit ", "80"},
                {"Kumar", "49"},
                {"Mahesh", "59"},
                {"Kumar", "59"},
                {"Mahesh", "29"},
                {"BHadani", "89"},
                {"Kamlesh", "79"},
                {"Rad", "99"},
                {"Kapoor", "19"}
        };
        System.out.println(interviewQustion.myString(salutation));
    }
}
