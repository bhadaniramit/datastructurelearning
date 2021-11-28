package PracticewithAlgo;

public class StarPattern {
    //Right Triangle Star Pattern

    public void rightTriangle(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void leftTriangle(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= n;j++) {
                System.out.print(" ");
                n--;
            }
            n =n;
            System.out.println("x");
            break;
        }
    }

    public static void main(String[] args) {
        StarPattern star = new StarPattern();
        star.leftTriangle(3);
    }
}
