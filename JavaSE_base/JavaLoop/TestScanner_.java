package JavaLoop;

import java.util.Scanner;

public class TestScanner_ {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    //从键盘接收数据
    int a =0;
    float b=0.0f;
    if (scanner.hasNextInt()){
        int a1= scanner.nextInt();
        System.out.println(a1);
    }
    if (scanner.hasNextFloat()){
        float b1= scanner.nextFloat();
        System.out.println(b1);
        }

    scanner.close();
    }
}
