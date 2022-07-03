package JavaOOP;

import java.io.IOException;

public class MethodF {
    // main方法
    public static void main(String[] args) {
        System.out.println(sayHi());
    }
    /**
     * 修饰符 返回值类型 方法名（...）{
     *     方法体
     *     return返回值;
     * }
     */

    //return结束方法，返回一个结果，可为空。
    public static String sayHi(){
        return"Hello,World!";
    }
    public int max(int a,int b){
        return a>b ? a:b;//三元运算符，若前为真返回a，否则返回b。
    }

    //抛出异常
    public void readFile(String a ) throws IOException{

    }
}
