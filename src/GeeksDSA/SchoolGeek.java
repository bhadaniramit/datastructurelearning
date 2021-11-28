package GeeksDSA;

public class SchoolGeek {

    //Merge Without Extra Space

    public int findMaxProfit(int[] myArray) {
        int profit = 0;
        int sum = 0;
        boolean flag = false;
        for (int i = 1; i < myArray.length; i++) {
            profit = myArray[i - 1] - myArray[i];
            if (myArray[i - 1] > myArray[i] && profit > sum) {
                sum = profit;
                flag = true;
            }
        }
        if (flag == false) {
            return 0;
        } else {
            return sum;
        }

    }



    public static void main(String[] args) {
        SchoolGeek school = new SchoolGeek();
//        System.out.println(school.findMaxProfit(new int[]{7, 12, 19, 1, 2, 3, 1}));
    int count =0;
        if(count<3){
            count++;
            main(null);
        }else{
            return;
        }
        System.out.println("Hello");
    }
}
