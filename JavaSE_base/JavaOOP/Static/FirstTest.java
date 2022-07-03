package JavaOOP.Static;

public class FirstTest {

    private static int age=18;//静态变量
    private int grade=99;//非静态变量
    public static void run(){}
    public void go(){}
    public static void main(String[] args) {
        FirstTest firstTest1= new FirstTest();

        System.out.println(FirstTest.age);
        //System.out.println(FirstTest.grade);非静态变量不能通过类直接引用，必须通过对象调用
        System.out.println(firstTest1.age);
        System.out.println(firstTest1.grade);

        FirstTest.run();//静态方法可以通过类直接调用
        firstTest1.go();//非静态方法只能通过对象调用
    }
}
