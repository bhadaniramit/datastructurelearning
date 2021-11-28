public class DotProduct {

    public void findDot(int[] a, int[] b){
        int result = 0;
        for(int i=0;i<a.length;i++){
            for(int j=0;j<b.length;j++){
                result += a[i] * b[j];
            }
        }
        System.out.println(result);
    }


    public static void main(String[] args) {
        DotProduct solution = new DotProduct();
        solution.findDot(new int[] {10,15}, new int[]{20,15});
    }
}
