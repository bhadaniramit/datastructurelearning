package AlgoSearchandSort;

public class LinearSearch {

    public void searchLinear(int[] myArray, int key) {
        boolean flag = false;
        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] == key) {
                System.out.println("Search Found");
                flag = true;
                break;
            }
        }
        if (flag == false) {
            System.out.println("Not found");
        }
    }

    public static void main(String[] args) {
        LinearSearch linear_search = new LinearSearch();
        linear_search.searchLinear(new int[]{5, 8, 18, 19, 21, 22, 100, 24}, 24);
    }
}
