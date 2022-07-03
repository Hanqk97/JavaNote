package JavaOOP.ObjectClass;


public class Application {
    //一个项目应该只有一个main方法
    public static void main(String[] args) {
        /**类，抽象的。需要实例化.
         * 类实例化后会返回一个自己的对象
        */
        Object1 test1=new Object1();
        Object1 test2=new Object1();

        test1.a="!";
        test2.b=3;
        System.out.println(test1.a+" "+test2.b);
        System.out.println("----------------------------------------------------------------------------------------");
        System.out.println("构造器");
        Constructor constructor = new Constructor("KK");
        System.out.println(constructor.name);
        System.out.println("----------------------------------------------------------------------------------------");
        System.out.println("封装");
        PrivatePackage privatePackage1=new PrivatePackage();
        System.out.println(privatePackage1.getName());
        privatePackage1.setGender("Male");
        System.out.println(privatePackage1.getGender());
        System.out.println("----------------------------------------------------------------------------------------");

    }

}
