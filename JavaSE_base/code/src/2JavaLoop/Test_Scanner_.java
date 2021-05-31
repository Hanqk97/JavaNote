package JavaLoop;

import java.util.Scanner;

public class Test_Scanner_ {
    //要求输入多个数字，每输入一个数字用回车确认，通过输入非数字来结束输入。计算其和和平均数。
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        double sum = 0;//和
        int m =0;//计数器
        while(scanner.hasNextDouble()){
            double x=scanner.nextDouble();
            m++;
            sum+=x;
            System.out.println("输入数字："+x);
        }
        System.out.println(m+"个数字，其和为："+sum);
        System.out.println("平均数为"+(sum/m));
    scanner.close();
    }
}
