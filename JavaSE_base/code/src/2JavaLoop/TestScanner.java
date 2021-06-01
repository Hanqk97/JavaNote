package JavaLoop;

import java.util.Scanner;

public class TestScanner {
    public static void main(String[] args) {
        //创建扫描器对象用于接收键盘输入
        Scanner A= new Scanner(System.in);
        System.out.println("使用next()方式接收:");
        //判断用户是否输入字符串
        if(A.hasNext()){
            //等待输入
            String a=A.next();
            System.out.println("输出的内容为："+a);
        }

        Scanner B= new Scanner(System.in);
        System.out.println("使用nextLine()方式接收:");
        if(B.hasNextLine()){
            String b=B.nextLine();
            System.out.println("输出的内容为："+b);
        }
        //凡是属于IO流如果不关闭会一直占用资源
        A.close();
        B.close();
    }
}
