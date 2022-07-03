package JavaOOP.Succeed.Override;

public class Applicaition {
    public static void main(String[] args) {
    ClassOne classOne=new ClassOne();
    ClassTwo classTwo=new ClassOne();
    //静态方法：方法的调用只和左边定义的数据类型有关
    classOne.sText();
    classTwo.sText();
    //非静态方法：重写
    classOne.NosText();
    classTwo.NosText();
    }
}
