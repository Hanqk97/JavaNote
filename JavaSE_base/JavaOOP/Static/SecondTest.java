package JavaOOP.Static;

public class SecondTest {
    {
        System.out.println("匿名代码块");
    }//用于赋初始值

    static{
        System.out.println("静态代码块");
    }

    public SecondTest(){
        System.out.println("构造方法");
    }

    public static void main(String[] args) {
        SecondTest secondTest1=new SecondTest();
        System.out.println("-------------------------------------");
        SecondTest secondTest2=new SecondTest();//静态代码块仅执行一次
    }
}
