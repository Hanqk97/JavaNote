package JavaOOP.Static;

import static java.lang.Math.random;//静态导入包
public class ThirdTest {
    public static void main(String[] args) {
        System.out.println(Math.random());
        System.out.println(random());//导入Math包后可以直接使用
    }
}
