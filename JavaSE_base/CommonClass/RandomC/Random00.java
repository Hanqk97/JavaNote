package CommonClass.RandomC;

import java.util.Random;

public class Random00 {
    public static void main(String[] args) {
    //使用Math类，返回带正号的double值，[0.0,1.0)
        System.out.println(Math.random());//0.8096919334512694
    //Random类
    //（1）利用带参数的构造器创建对象
        Random r1=new Random(1000);//此处的seed值决定了输出的随机数数值
        int i=r1.nextInt();
        System.out.println(i);//-1244746321
    //（2）利用空参构造器创建对象,表面是无参，其实底层还是有参构造器
        Random r2=new Random();//此方法输出的随机数每次都不同
        int i1= r2.nextInt(10);//返回[0,指定值)的随机数
        System.out.println(i1);//4
    }
}
