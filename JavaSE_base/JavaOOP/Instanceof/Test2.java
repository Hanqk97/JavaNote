package JavaOOP.Instanceof;

public class Test2 {
    public static void main(String[] args) {
    //类型转换 Num1（父类）》Num2（子类）
        Num1 num2_1=new Num2();
        ((Num2)num2_1).go();//num2.go();
        Num2 num2_2=new Num2();
        num2_2.run();//子类到父类可以自动转换，但子类转为父类可能会丢失自己的一些方法

    }
}
