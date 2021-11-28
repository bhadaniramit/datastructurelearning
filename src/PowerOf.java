public class PowerOf {


    public void checkPowerOfTen(int myNumber) {
        int result = 0;
        boolean flag = false;
            while (1 < myNumber) {
                result = myNumber % 10;
                myNumber = myNumber / 10;
                if (myNumber == 1 && result ==0 ) {
                    System.out.println("Yes found");
                    flag = true;
                }
            }
        if (flag == false) {
            System.out.println("Not not found");
        }
    }

    public static void main(String[] args) {
        PowerOf powerOf = new PowerOf();
        powerOf.checkPowerOfTen(1000000);
    }
}
