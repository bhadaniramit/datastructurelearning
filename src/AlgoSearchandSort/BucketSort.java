package AlgoSearchandSort;

public class BucketSort {

    int getMax(int[] a) {
        int max = a[0];
        for (int i = 0; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        BucketSort bucketSort = new BucketSort();
        System.out.println(bucketSort.getMax(new int[]{5, 8, 18, 19, 21, 22, 100, 24}));
    }
}
