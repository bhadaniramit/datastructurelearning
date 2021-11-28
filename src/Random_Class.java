public class Random_Class {

    public void getMinMax(int[] a) {
        //Write your code here
        for(int i=0; i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i]>a[j]){
                    a[i] = a[i] + a[j] ;
                    a[j] = a[i] - a[j];
                    a[i] = a[i] - a[j];
                }
            }
        }
        System.out.println("Min is "+a[0]);
        System.out.println("Max is "+a[a.length-1]);
    }

    public static void main(String[] args) {
        Random_Class random = new Random_Class();
        random.getMinMax(new int[]{3, 2, 1, 56, 10000, 167});
    }
}
