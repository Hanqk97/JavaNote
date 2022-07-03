package JavaOOP.ObjectClass;

public class Constructor {
    //一个类即使什么都不写，也会存在一个方法
    //无参构造
    String name;
    int age;
    ///实例化初始值
    public Constructor(){
    }
    //有参构造
    public Constructor(String a){
        this.name=a;//此处this.name等于上面的name
    }
    //一旦使用有参构造，无参构造必须显示定义。



}

