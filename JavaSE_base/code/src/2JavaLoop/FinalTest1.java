package JavaLoop;

public class FinalTest1 {
    //打印三角形
    public static void main(String[] args) {
        for (int i = 0; i <= 5; i++) {
            for (int m = 5; m > i; m--) {
                System.out.print(" ");}
            for (int j = 0; j < i; j++) {
                    System.out.print("*");
                }
            for (int m = 1; m < i; m++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
