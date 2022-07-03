package JavaLoop;

public class ForTest3 {
    public static void main(String[] args) {
        //打印九九乘法表
        for (int i = 1; i <=9; i++) {
            for (int m = 1; m <= i; m++) {
                System.out.print(i+"*"+m+"="+(i*m)+" ");
            }
           System.out.print("\n");
        }
    }
}
